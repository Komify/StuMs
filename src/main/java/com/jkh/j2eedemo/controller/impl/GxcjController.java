package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxcjbll;
import com.jkh.j2eedemo.bll.impl.Gxzybll;
import com.jkh.j2eedemo.entity.Gxcj;
import com.jkh.j2eedemo.entity.Gxzy;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.util.dateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxcj")
public class GxcjController {
    @Autowired
    private Gxcjbll bll;
    @PostMapping("findbypage")
    public KesunReturn findbypage(@RequestBody Map<String,Object> cons){
        KesunReturn back = new KesunReturn();
        if (cons==null||cons.size()==0
                ||cons.get("pageNumber")==null||cons.get("rowsCount")==null){
            back.setMessage("您未提供分页参数!");
            back.setObj(null);
            back.setCode("-A01");
            return back;
        }
        int startPage= Integer.valueOf(cons.get("pageNumber").toString());
        int rowsCount= Integer.valueOf(cons.get("rowsCount").toString());
        return bll.findByPage(cons, startPage, rowsCount);


    }
    @PostMapping("batchdelstudent")
    public KesunReturn dobatchdel(@RequestBody Map<String,Object> cons){
        if (cons!=null&&cons.get("ids")!=null){
            return bll.batchDel(cons);
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供批量删除条件!");
            return back;
        }
    }
    @PostMapping("editstudent")
    public KesunReturn dobatchdel(@RequestBody Gxcj gxcj){
        if (gxcj!=null){
            bll.setModel(gxcj);
            return bll.edit();
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
            return back;
        }
    }
    @PostMapping("findmore")
    public KesunReturn findmore(@RequestBody Map<String,Object> cons ){
        if (cons.size()!=0&&cons.get("jnm")!=null){
            Gxcj gxcj = new Gxcj();
            gxcj.setId(cons.get("jnm").toString());

            bll.setModel(gxcj);
            return bll.findById();
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供搜索条件!");
            return back;
        }
    }

    @PostMapping("delstu")
    @ResponseBody
    public KesunReturn del(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("jnm")!=null){
            Gxcj gxcj = new Gxcj();
            System.out.println("id"+cons.get("jnm"));
            gxcj.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxcj.getId());
            bll.setModel(gxcj);
            KesunReturn back = bll.delete();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供删除条件!");
            return back;
        }

    }
    @PostMapping("add")
    @ResponseBody
    public KesunReturn add(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("xsjnm")!=null||
                cons.get("kcjnm")!=null||cons.get("jsjnm")!=null||cons.get("xqjnm")!=null || cons.get("cj")!=null ||cons.get("lx")!=null ||cons.get("kssj")!=null ||cons.get("sjcjsj")!=null ||cons.get("yhzh")!=null){
            Gxcj gxcj = new Gxcj();
            System.out.println("id"+cons.get("jnm"));
            gxcj.setXsjnm(String.valueOf(cons.get("xsjnm")));

            gxcj.setKcjnm(String.valueOf(cons.get("kcjnm")));
            gxcj.setJsjnm(String.valueOf(cons.get("jsjnm")));

            gxcj.setXqjnm(String.valueOf(cons.get("xqjnm")));
            gxcj.setCj((String) cons.get("cj"));
            gxcj.setLx(String.valueOf(cons.get("lx")));
            gxcj.setKssj(dateUtil.GetDate((String)cons.get("kssj")));
            gxcj.setSjcjsj(dateUtil.GetDate((String)cons.get("sjcjsj")));
            gxcj.setYhzh(String.valueOf(cons.get("yhzh")));


            System.out.println(gxcj.getId());
            bll.setModel(gxcj);
            KesunReturn back = bll.add();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供数据!");
            return back;
        }



    }
}
