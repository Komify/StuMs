package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxkbbll;
import com.jkh.j2eedemo.entity.Gxkb;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxkb")
public class GxkbController {
    @Autowired
    private Gxkbbll bll;
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
    public KesunReturn dobatchdelstudent(@RequestBody Gxkb gxkb){
        if (gxkb!=null){
            bll.setModel(gxkb);
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
            Gxkb gxkb = new Gxkb();
            gxkb.setId(cons.get("jnm").toString());
            bll.setModel(gxkb);
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
            Gxkb gxkb = new Gxkb();
            System.out.println("id"+cons.get("jnm"));
            gxkb.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxkb.getId());
            bll.setModel(gxkb);
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
            Gxkb gxkb = new Gxkb();
            System.out.println("id"+cons.get("jnm"));
            gxkb.setBjjnm(String.valueOf(cons.get("bjjnm")));
            gxkb.setBmjnm(String.valueOf(cons.get("bmjnm")));
            gxkb.setCjsj(String.valueOf(cons.get("cjsj")));
            gxkb.setCzyh(String.valueOf(cons.get("czyh")));
            gxkb.setJc(String.valueOf(cons.get("jc")));
            gxkb.setJsjnm(String.valueOf(cons.get("jsjnm")));
            gxkb.setJzgjnm(String.valueOf(cons.get("jzgjnm")));
            gxkb.setKcjnm(String.valueOf(cons.get("kcjnm")));
            gxkb.setXq(String.valueOf(cons.get("xq")));
            gxkb.setXqjnm(String.valueOf(cons.get("xqjnm")));
            gxkb.setXxbh(String.valueOf(cons.get("xxbh")));
            gxkb.setCjsj(String.valueOf(cons.get("cjsj")));

            System.out.println(gxkb.getId());
            bll.setModel(gxkb);
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
