package com.jkh.j2eedemo.controller.impl;

import cn.hutool.json.JSONObject;
import com.jkh.j2eedemo.annotation.PassToken;
import com.jkh.j2eedemo.annotation.UserLoginToken;
import com.jkh.j2eedemo.bll.impl.Gxyhbll;
import com.jkh.j2eedemo.bll.impl.TokenService;
import com.jkh.j2eedemo.entity.Gxyh;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxyh")
@Api(tags = "用户管理模块")
public class GxyhController {
    JSONObject jsonObject = new JSONObject();
    @Autowired
    private Gxyhbll bll;
    @Autowired
    TokenService tokenService;
    @PassToken
    @RequestMapping("login")
    public KesunReturn login(@RequestBody Map<String,Object> cons, HttpServletResponse response){
        KesunReturn back2=  new KesunReturn();
        if (cons.isEmpty()||cons.get("username")==null||cons.get("password")==null){
        back2.setCode("0000");
        back2.setMessage("未填写登录信息登录失败");
    }else
    {
        KesunReturn back = bll.login(String.valueOf(cons.get("username")), (String) cons.get("password"));
        if (back.getCode()=="1000"){
            Gxyh gxyh = new Gxyh();
            gxyh.setZh(String.valueOf(cons.get("username")));
            gxyh.setMm(String.valueOf(cons.get("password")));
            System.out.println(cons.get("name"));
            String token = tokenService.getToken(gxyh);
            jsonObject.put("token", token);
            System.out.println(token);
//            Cookie cookie = new Cookie("token", token);          cookie.setPath("/");
//            response.addCookie(cookie);
            back2.setObj(token);
            back2.setCode("200");
            back2.setMessage("登录成功!");

        }else {
            back2.setCode("404");
            back2.setMessage("登录失败");
        }
    }
        return back2;
}
    @PostMapping("regist")
    @ApiResponses({
            @ApiResponse(code = 101, message = "注册失败!注册的数据格式不对!"),
            @ApiResponse(code = 102, message = "没有填写注册信息!"),
            @ApiResponse(code = 103, message = "用户已经注册!")
    })
    @ApiOperation(value = "用户注册",httpMethod ="POST",notes = "传入用户对象,其中状态zt为指定状态 冻结或者正常")
    public KesunReturn registin(@ApiParam("传入用户对象,其中状态zt为指定状态 冻结或者正常") @RequestBody Gxyh gxyh ){
        if (gxyh.getZh()==null&&gxyh.getMm()==null){
            KesunReturn back = new KesunReturn();
            back.setCode("102");
            back.setMessage("未填写注册信息!");
            return back;
        }else
        {
            KesunReturn back = bll.regist(gxyh);
            return back;
        }
    }
    @UserLoginToken
    @GetMapping("show")
    public KesunReturn show(){
        KesunReturn kesunReturn = new KesunReturn();
        kesunReturn.setCode("200");
        return kesunReturn;
    }
}
