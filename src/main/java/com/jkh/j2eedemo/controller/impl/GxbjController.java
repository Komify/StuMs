package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxbjbll;
import com.jkh.j2eedemo.entity.Gxbj;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxbj")
public class GxbjController {
    @Autowired
    private Gxbjbll  bll;
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
    public KesunReturn dobatchdelstudent(@RequestBody Gxbj gxbj){
        if (gxbj!=null){
            bll.setModel(gxbj);
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
            Gxbj gxbj = new Gxbj();
            gxbj.setId(cons.get("jnm").toString());
            bll.setModel(gxbj);
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
    public KesunReturn del(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty()&&cons.get("jnm")!=null){
            Gxbj gxbj = new Gxbj();
            System.out.println("id"+cons.get("jnm"));
            gxbj.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxbj.getId());
            bll.setModel(gxbj);
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
        if (!cons.isEmpty()&&cons.get("bjbh")!=null||
                cons.get("bjmc")!=null||cons.get("bzxm")!=null||
                cons.get("bzrxm")!=null||cons.get("sszy")!=null){
            Gxbj gxbj = new Gxbj();
            gxbj.setBjbh(String.valueOf(cons.get("bjbh")));
            gxbj.setBjmc(String.valueOf(cons.get("bjmc")));
            gxbj.setBzrxm(String.valueOf(cons.get("bzrxm")));
            gxbj.setBzxm(String.valueOf(cons.get("bzxm")));
            gxbj.setSszy(String.valueOf(cons.get("sszy")));
            bll.setModel(gxbj);
            KesunReturn back = bll.add();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供数据!");
            return back;
        }


    }
    @PostMapping("getallbj")
    public KesunReturn getAllBj(){
        KesunReturn findall = bll.findall();
        return findall;
    }
}
