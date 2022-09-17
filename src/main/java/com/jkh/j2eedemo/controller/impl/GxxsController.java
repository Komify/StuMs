package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.annotation.UserLoginToken;
import com.jkh.j2eedemo.bll.impl.Gxxsbll;
import com.jkh.j2eedemo.entity.Gxxs;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.util.dateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
@RequestMapping("gxxs")
public class GxxsController {
    @Autowired
    private Gxxsbll bll;
    @UserLoginToken
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
    public KesunReturn dobatchdelstudent(@RequestBody Map<String,Object> cons){
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
    public KesunReturn dobatchdelstudent(@RequestBody Gxxs gxxs){
        if (gxxs!=null){
            bll.setModel(gxxs);
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
            Gxxs gxxs = new Gxxs();
            gxxs.setId(cons.get("jnm").toString());
            bll.setModel(gxxs);
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
    public KesunReturn delstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("jnm")!=null){
            Gxxs gxxs = new Gxxs();
            System.out.println("id"+cons.get("jnm"));
            gxxs.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxxs.getId());
            bll.setModel(gxxs);
            KesunReturn back = bll.delete();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供删除条件!");
            return back;
        }

    }
    @UserLoginToken
    @PostMapping("add")
    @ResponseBody
    public KesunReturn addstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("xm")!=null||
                cons.get("ssbj")!=null||cons.get("ssbm")!=null||cons.get("ssbm")!=null){
            Gxxs gxxs = new Gxxs();
            System.out.println("id"+cons.get("jnm"));
            gxxs.setXm(String.valueOf(cons.get("xm")));
            gxxs.setXh(String.valueOf(cons.get("xh")));
            gxxs.setSsbj(String.valueOf(cons.get("ssbj")));
            gxxs.setYwxm(String.valueOf(cons.get("ywxm")));
            gxxs.setSsbm(String.valueOf(cons.get("ssbm")));
            gxxs.setDwh(String.valueOf(cons.get("dwh")));
            gxxs.setXb(String.valueOf(cons.get("xb")));
            gxxs.setCsrq(dateUtil.GetDate(String.valueOf(cons.get("csrq"))));
            System.out.println(gxxs.getId());
            bll.setModel(gxxs);
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
