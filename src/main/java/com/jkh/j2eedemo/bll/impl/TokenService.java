package com.jkh.j2eedemo.bll.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;


import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.jkh.j2eedemo.entity.Gxyh;
import org.springframework.stereotype.Service;

/***
 * token 下发
* @Title: TokenService.java 
* @author MRC
* @date 2019年5月27日 下午5:40:25 
* @version V1.0
 */
@Service("TokenService")
public class TokenService {

    /***
     * token 下发
     * @Title: TokenService.java
     * @author MRC
     * @date 2019年5月27日 下午5:40:25
     * @version V1.0
     */

        public String getToken(Gxyh gxyh) {
            Date start = new Date();
            long currentTime = System.currentTimeMillis() + 60*60*1000;//一小时有效时间
            Date end = new Date(currentTime);
            String token = "";

            token = JWT.create().withAudience(gxyh.getZh()).withIssuedAt(start).withExpiresAt(end)
                    .sign(Algorithm.HMAC256(gxyh.getMm()));
            return token;
        }

}
