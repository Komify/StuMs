package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxxxbll;
import com.jkh.j2eedemo.bll.impl.Gxzybll;
import com.jkh.j2eedemo.entity.Gxxx;
import com.jkh.j2eedemo.entity.Gxzy;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxxx")
public class GxxxController {
    @Autowired
    private Gxxxbll bll;
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
    public KesunReturn dobatchdel(@RequestBody Gxxx gxxx){
        if (gxxx!=null){
            bll.setModel(gxxx);
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
        if (cons.size()!=0&&cons.get("xxdm")!=null){
            Gxxx gxxx = new Gxxx();
            gxxx.setId(cons.get("xxdm").toString());

            bll.setModel(gxxx);
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
        if (!cons.isEmpty()&&cons.get("xxdm")!=null){
            Gxxx gxxx = new Gxxx();
            System.out.println("id"+cons.get("xxdm"));
            gxxx.setId(String.valueOf(cons.get("xxdm")));
            System.out.println(gxxx.getId());
            bll.setModel(gxxx);
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
        if (!cons.isEmpty()&&cons.get("xxmc")!=null||
                cons.get("xxdz")!=null||cons.get("jxny")!=null||cons.get("xxbxlx")!=null||cons.get("xzxm")!=null){
            Gxxx gxxx = new Gxxx();
            System.out.println("id"+cons.get("xxdm"));
            gxxx.setXxdm(String.valueOf(cons.get("xxdm")));

            gxxx.setXxmc(String.valueOf(cons.get("xxmc")));

            gxxx.setXxdz(String.valueOf(cons.get("xxdz")));
            gxxx.setJxny(String.valueOf(cons.get("jxny")));

            gxxx.setXxbxlx(String.valueOf(cons.get("xxbxlx")));
            gxxx.setXzxm(String.valueOf(cons.get("xzxm")));


            System.out.println(gxxx.getId());
            bll.setModel(gxxx);
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
