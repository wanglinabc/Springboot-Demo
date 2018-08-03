package com.example.demo.Controller.admin;

import com.example.demo.Service.IProxyReferrerAwardService;
import com.example.demo.Service.Impl.AdminServiceImpl;
import com.example.demo.Util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/system")
@Api(description ="系统操作", tags="SystemApi")
public class SystemController {

    @Autowired
    private IProxyReferrerAwardService proxyService;

    @PostMapping("/setProxy")
    @ApiOperation(value="设置代理商推荐奖励")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "direct",value = "直接推荐代理奖励",required = true, paramType = "form", dataType = "double"),
            @ApiImplicitParam(name = "doubleindirect",value = "间接1推荐代理奖励",required = true, paramType = "form", dataType = "double"),
            @ApiImplicitParam(name = "indirect",value = "间接2推荐代理奖励",required = true, paramType = "form", dataType = "double"),
            @ApiImplicitParam(name = "tripleindirect",value = "间接3推荐代理奖励",required = true, paramType = "form", dataType = "double"),
    })
    public ResponseResult setProxyReferrerAward(double direct, double doubleindirect, double indirect, double tripleindirect){
        return  proxyService.setProxy(direct,doubleindirect,indirect,tripleindirect);
    }
}
