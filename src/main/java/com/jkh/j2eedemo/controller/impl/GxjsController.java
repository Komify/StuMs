package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxjsbll;
import com.jkh.j2eedemo.entity.Gxjs;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxjs")
public class GxjsController {
    @Autowired
    private Gxjsbll bll;
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
    @PostMapping("batchdel")
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
    @PostMapping("edit")
    public KesunReturn dobatchdelstudent(@RequestBody Gxjs gxjs){
        if (gxjs!=null){
            bll.setModel(gxjs);
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
            Gxjs gxjs = new Gxjs();
            gxjs.setId(cons.get("jnm").toString());
            bll.setModel(gxjs);
            return bll.findById();
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供搜索条件!");
            return back;
        }
    }
    @PostMapping("del")
    @ResponseBody
    public KesunReturn delstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("jnm")!=null){
            Gxjs gxjs = new Gxjs();
            System.out.println("id"+cons.get("jnm"));
            gxjs.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxjs.getId());
            bll.setModel(gxjs);
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
    public KesunReturn addstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()){
            Gxjs gxjs = new Gxjs();
            gxjs.setJsbh(String.valueOf(cons.get("jsbh")));
            gxjs.setJsmc(String.valueOf(cons.get("jsmc")));
            gxjs.setJslb(String.valueOf(cons.get("jslb")));
            gxjs.setJswz(String.valueOf(cons.get("jswz")));
            gxjs.setZws(String.valueOf(cons.get("zws")));
            gxjs.setSsbm(String.valueOf(cons.get("ssbm")));

            System.out.println(gxjs.getId());
            bll.setModel(gxjs);
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
