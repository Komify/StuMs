package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxkcbll;
import com.jkh.j2eedemo.bll.impl.Gxzybll;
import com.jkh.j2eedemo.entity.Gxkc;
import com.jkh.j2eedemo.entity.Gxzy;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxzy")
public class GxzyController {
    @Autowired
    private Gxzybll bll;
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
    public KesunReturn dobatchdel(@RequestBody Gxzy gxzy){
        if (gxzy!=null){
            bll.setModel(gxzy);
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
            Gxzy gxzy = new Gxzy();
            gxzy.setId(cons.get("jnm").toString());

            bll.setModel(gxzy);
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
            Gxzy gxzy = new Gxzy();
            System.out.println("id"+cons.get("jnm"));
            gxzy.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxzy.getId());
            bll.setModel(gxzy);
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
        if (!cons.isEmpty()&&cons.get("zyh")!=null||
                cons.get("zymc")!=null||cons.get("ssxx")!=null||cons.get("zxbm")!=null){
            Gxzy gxzy = new Gxzy();
            System.out.println("id"+cons.get("jnm"));
            gxzy.setZyh(String.valueOf(cons.get("zyh")));

            gxzy.setZymc(String.valueOf(cons.get("zymc")));
            gxzy.setSsxx(String.valueOf(cons.get("ssxx")));

            gxzy.setSsbm(String.valueOf(cons.get("zxbm")));


            System.out.println(gxzy.getId());
            bll.setModel(gxzy);
            KesunReturn back = bll.add();
            return back;
        }else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供数据!");
            return back;
        }



    }
    @PostMapping("findallsszy")
    public  KesunReturn findallsszy(){
        return bll.findall();
    }
    @PostMapping("findbyzyname")
    public  KesunReturn findallsszy(String zyname){
        return bll.findbyzyname(zyname);
    }

}
