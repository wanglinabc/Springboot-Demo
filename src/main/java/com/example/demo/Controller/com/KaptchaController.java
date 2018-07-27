package com.example.demo.Controller.com;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.Util.RedisTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.code.kaptcha.impl.DefaultKaptcha;


@RestController
@RequestMapping("/Kaptcha")
public class KaptchaController {

    @Resource
    private RedisTool redisTool;

    /**
     * 1、验证码工具
     */
    @Autowired
    DefaultKaptcha defaultKaptcha;

    /**
     * 2、生成验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @GetMapping("/defaultKaptcha")
    public void  defaultKaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {

        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();

        String rightCode="";
        try {
            // 生产验证码字符串并保存到session中
            rightCode = (String)defaultKaptcha.createText();
//          httpServletRequest.getSession().setAttribute("rightCode", rightCode);
            // 使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(rightCode);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return ;
        }

        // 将正确验证码值+IP,保存到数据库中
        String remoteAddr = httpServletRequest.getRemoteAddr();
        redisTool.set(remoteAddr,rightCode,300);
        System.out.println(rightCode);
        System.out.println(remoteAddr);

        // 定义response输出类型为image/jpeg类型，使用response输出流输出图片的byte数组
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();




    }

    /**
     * 3、校对验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
    @GetMapping("/imgvrifyKaptcha")
//    public Map<String, Object> imgvrifyControllerDefaultKaptcha(String tryCode,HttpServletRequest httpServletRequest,
//                                                                HttpServletResponse httpServletResponse) {
    public boolean imgvrifyControllerDefaultKaptcha(String tryCode,HttpServletRequest httpServletRequest,
                                                                HttpServletResponse httpServletResponse) {

        String remoteAddr = httpServletRequest.getRemoteAddr();
        String testCode= redisTool.get(remoteAddr).toString();
        return testCode.equals(tryCode);
    }
}
