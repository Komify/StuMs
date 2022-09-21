package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.annotation.UserLoginToken;
import com.jkh.j2eedemo.bll.impl.Gxxsbll;
import com.jkh.j2eedemo.entity.Gxxs;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.util.dateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@CrossOrigin(value = "*", allowCredentials = "true")
@RequestMapping("gxxs")
public class GxxsController {
    @Autowired
    private Gxxsbll bll;

    @UserLoginToken
    @PostMapping("findbypage")
    public KesunReturn findbypage(@RequestBody Map<String, Object> cons) {
        KesunReturn back = new KesunReturn();
        if (cons == null || cons.size() == 0
                || cons.get("pageNumber") == null || cons.get("rowsCount") == null) {
            back.setMessage("您未提供分页参数!");
            back.setObj(null);
            back.setCode("-A01");
            return back;
        }
        int startPage = Integer.valueOf(cons.get("pageNumber").toString());
        int rowsCount = Integer.valueOf(cons.get("rowsCount").toString());
        return bll.findByPage(cons, startPage, rowsCount);


    }

    @PostMapping("batchdelstudent")
    public KesunReturn dobatchdelstudent(@RequestBody Map<String, Object> cons) {
        if (cons != null && cons.get("ids") != null) {
            return bll.batchDel(cons);
        } else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供批量删除条件!");
            return back;
        }
    }
    @PostMapping("uploadtouxiang")
    public String updateHeadPortrait(@RequestParam(value = "xh") String userId , @RequestParam(value = "file") MultipartFile multipartFile){

        try {
            Gxxs gxxs = new Gxxs();
            gxxs.setXh(userId);
            gxxs.setZp(multipartFile.getBytes());
            System.out.println(multipartFile.getBytes());
            int i = bll.uploadtouxiang(gxxs);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }

    }
    @PostMapping("findtouxiang")
    public Gxxs findtouxiang( @RequestBody Map<String,Object> cons )
    { String  xh=String.valueOf(cons.get("xh"));
        return bll.findtouxiang(xh);
    }
    @PostMapping("editstudent")
    public KesunReturn dobatchdelstudent(@RequestBody Gxxs gxxs) {
        if (gxxs != null) {
            bll.setModel(gxxs);
            return bll.edit();
        } else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供修改条件!");
            return back;
        }
    }

    @PostMapping("findmore")
    public KesunReturn findmore(@RequestBody Map<String, Object> cons) {
        if (cons.size() != 0 && cons.get("jnm") != null) {
            Gxxs gxxs = new Gxxs();
            gxxs.setId(cons.get("jnm").toString());
            bll.setModel(gxxs);
            return bll.findById();
        } else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供搜索条件!");
            return back;
        }
    }

    @PostMapping("delstu")
    @ResponseBody
    public KesunReturn delstu(@RequestBody Map<String, Object> cons) {
        if (!cons.isEmpty() && cons.get("jnm") != null) {
            Gxxs gxxs = new Gxxs();
            System.out.println("id" + cons.get("jnm"));
            gxxs.setId(String.valueOf(cons.get("jnm")));
            System.out.println(gxxs.getId());
            bll.setModel(gxxs);
            KesunReturn back = bll.delete();
            return back;
        } else {
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
        System.out.println(cons);
        if (!cons.isEmpty() && cons.get("xm") != null ||
                cons.get("ssbj") != null || cons.get("ssbm") != null || cons.get("ssbm") != null) {
            Gxxs gxxs = new Gxxs();
            System.out.println("id" + cons.get("jnm"));
            gxxs.setXm(String.valueOf(cons.get("xm")));
            gxxs.setXh(String.valueOf(cons.get("xh")));
            gxxs.setSsbj(String.valueOf(cons.get("ssbj")));
            gxxs.setYwxm(String.valueOf(cons.get("ywxm")));
            gxxs.setSsbm(String.valueOf(cons.get("ssbm")));
            gxxs.setDwh(String.valueOf(cons.get("dwh")));
            gxxs.setXb(String.valueOf(cons.get("xb")));
            gxxs.setHyzk(String.valueOf(cons.get("hyzk")));
            gxxs.setJg(String.valueOf(cons.get("csd")));
            gxxs.setMz(String.valueOf(cons.get("mz")));
            gxxs.setJkzk(String.valueOf(cons.get("jkzk")));
            gxxs.setZzmm(String.valueOf(cons.get("zzmm")));
            gxxs.setGj(String.valueOf(cons.get("gj")));
            gxxs.setSfzjh(String.valueOf(cons.get("sfzjh")));
            gxxs.setCsd(String.valueOf(cons.get("jg")));
            gxxs.setCym(String.valueOf(cons.get("cym")));
            gxxs.setZjyxq(dateUtil.GetDate(String.valueOf
                    (cons.get("zjyxq"))));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cons.get("sfzjh"));
            stringBuilder.insert(10, "-");
            stringBuilder.insert(13, "-");
            String csrq=  stringBuilder.substring(6, 16);

            System.out.println("csrq"+csrq);
            System.out.println("mmm"+dateUtil.GetDate(csrq));
            gxxs.setCsrq(dateUtil.GetDate(csrq));
            System.out.println(gxxs.getId());
            bll.setModel(gxxs);
            KesunReturn back = bll.add();
            return back;
        } else {
            KesunReturn back = new KesunReturn();
            back.setCode("0000");
            back.setMessage("未提供数据!");
            return back;
        }

    }
}
