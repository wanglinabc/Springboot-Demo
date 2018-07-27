package com.example.demo.Util;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;


/*
 * 构造及解析jwt的工具类
 */

@Component
public class JwtAuth {

    private static final String audience = "098f6bcd4621d373cade4e832627e4f6";
    private static final String base64Secret = "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2w0ZjY=";
    private static final String issuer = "restapiuser";
    private static final int expiresSecond = 28800000; //单位毫秒

    /**
     * 解析jwt
     */
    public static Claims parseJWT(String jsonWebToken){
        try
        {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Secret))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    /**
     * 构建jwt
     */
    public static String createJWT(String userId)
    {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

//        long nowMillis = System.currentTimeMillis();
//        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(base64Secret);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //自定义生存时间
        long time = System.currentTimeMillis();

        System.out.println(time + expiresSecond);

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                .claim("userid", userId)
                .claim("outtime", time + expiresSecond)
                .setIssuer(issuer)
                .setAudience(audience)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token验证过期时间
/*        if (expiresSecond >= 0) {
            long expMillis = nowMillis + expiresSecond;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }*/

        //生成JWT
        return builder.compact();
    }
}
