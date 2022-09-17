package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.Gxbjbll;
import com.jkh.j2eedemo.bll.impl.Gxxqbll;
import com.jkh.j2eedemo.entity.Gxbj;
import com.jkh.j2eedemo.entity.Gxxq;
import com.jkh.j2eedemo.entity.KesunReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("gxxq")
public class GxxqController {
    @Autowired
    private Gxxqbll bll;
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
    public KesunReturn dobatchdelstudent(@RequestBody Gxxq gxxq){
        if (gxxq!=null){
            bll.setModel(gxxq);
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
            Gxxq gxxq = new Gxxq();
            gxxq.setId((String)cons.get("jnm"));
            bll.setModel(gxxq);
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
            Gxxq gxxq = new Gxxq();
            System.out.println("id"+cons.get("jnm"));
            gxxq.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxxq.getId());
            bll.setModel(gxxq);
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
        if (!cons.isEmpty()&&cons.get("bh")!=null||
                cons.get("mc")!=null||cons.get("qsxn")!=null||
                cons.get("jsxn")!=null||cons.get("ssxx")!=null){
            Gxxq gxxq = new Gxxq();
            gxxq.setBh(String.valueOf(cons.get("bh")));
            gxxq.setMc(String.valueOf(cons.get("mc")));
            gxxq.setQsxn((String) cons.get("qsxn"));
            gxxq.setJsxn((String) cons.get("jsxn"));
            gxxq.setSsxx(String.valueOf(cons.get("ssxx")));
            bll.setModel(gxxq);
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
