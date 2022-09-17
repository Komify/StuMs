package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxjzgbll;
import com.jkh.j2eedemo.entity.Gxjs;
import com.jkh.j2eedemo.entity.Gxjzg;
import com.jkh.j2eedemo.entity.Gxkb;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("gxjzg")
@CrossOrigin
public class GxjzgController {
    @Autowired
    private Gxjzgbll bll;
    @PostMapping("add")
    public KesunReturn addgxjzg(@RequestBody Gxjzg gxjzg){
        if (gxjzg==null||gxjzg.getDwh()==null||gxjzg.getSsbm()==null||gxjzg.getXm()==null){
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setObj(null);
            back.setMessage("您没有传递查询参数!");
            return back;
        }else{
            bll.setModel(gxjzg);
            return bll.add();
        }
    }
   @PostMapping("findbypage")
    public KesunReturn findbypage(@RequestBody Map<String,Object> cons){
        if (cons.size()==0||cons.get("pageNumber")==null||cons.get("rowsCount")==null){
            KesunReturn back = new KesunReturn();

           back.setCode("0000");
           back.setMessage("您没有提供查询参数!");
           back.setObj(null);
           return back;
        }else {
        int startpage=Integer.valueOf(cons.get("pageNumber").toString());
            int rowscount=Integer.valueOf(cons.get("rowsCount").toString());

        return     bll.findByPage(cons,startpage,rowscount);
        }
   }
    @PostMapping("findmore")
    public KesunReturn findmore(@RequestBody Map<String,Object> cons ){
        if (cons.size()!=0&&cons.get("jnm")!=null){
            Gxjzg gxjzg = new Gxjzg();
            gxjzg.setId(cons.get("jnm").toString());
            bll.setModel(gxjzg);
            return bll.findById();
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供搜索条件!");
            return back;
        }
    }
    @PostMapping("edit")
    public KesunReturn dobatchdelstudent(@RequestBody Gxjzg gxjzg){
        if (gxjzg!=null){
            bll.setModel(gxjzg);
            return bll.edit();
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
            return back;
        }
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
    @PostMapping("del")
    @ResponseBody
    public KesunReturn delstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("jnm")!=null){
            Gxjzg gxjzg = new Gxjzg();
            System.out.println("id"+cons.get("jnm"));
            gxjzg.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxjzg.getId());
            bll.setModel(gxjzg);
            KesunReturn back = bll.delete();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供删除条件!");
            return back;
        }

    }
}
