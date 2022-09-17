package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IGxyh;
import com.jkh.j2eedemo.entity.Gxyh;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Service
public class Gxyhbll extends AbsSuperService {
    @Autowired
    private IGxyh gxyhdao;

    @Override
    public IDoData getDao() {
        return gxyhdao;
    }

    public KesunReturn login(String name, String password) {
        KesunReturn back = new KesunReturn();
        if (name != null && password != null) {
            Gxyh gxyh = new Gxyh();
            gxyh.setMm(password);
            gxyh.setZh(name);
            Gxyh login = gxyhdao.login(gxyh);
            if (login != null && login.getZh() != null && login.getMm() != null && login.getMm().equals(password)) {
                back.setMessage("登录成功!");
                back.setCode("1000");
            } else {
                back.setMessage("登录失败!");
                back.setCode("0000");
            }
        }
        return back;
    }

    public KesunReturn regist(Gxyh gxyhs) {
        KesunReturn back = new KesunReturn();
        if (gxyhs != null && gxyhs.getMm() != null && gxyhs.getZh() != null) {
            if ((gxyhdao.finduser(gxyhs.getZh())) == null) {
                int res = gxyhdao.regist(gxyhs);
                if (res > 0) {
                    back.setMessage("注册成功!");
                    back.setCode("200");
                } else {
                    back.setMessage("注册失败!");
                    back.setCode("102");
                }
            }else{
                   back.setMessage("该用户已经注册!");
                   back.setCode("103");
            }
        }
            return back;
        }

    }
