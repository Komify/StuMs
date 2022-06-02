package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.bll.impl.iStudentImpl;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("student")
@CrossOrigin
public class StudentController {
    @Autowired
    private iStudentImpl bll;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public KesunReturn doaddstu(@RequestBody Student student) {
        bll.setModel(student);
        KesunReturn back = bll.addStu();
        System.out.println(back.getMessage());
        return back;
    }

    @RequestMapping("stu")
    public String stu() {
        return "student";
    }

    @RequestMapping(value = "findbyid", method = RequestMethod.POST)
    @ResponseBody
    public KesunReturn findbyid(@RequestBody Map<String, Object> cons) {
        Student student = new Student();
        student.setId(cons.get("id").toString().trim());
        bll.setModel(student);
        KesunReturn back = bll.findStuById();
        System.out.println(back.getMessage());
        return back;
    }

    @PostMapping("edit")
    @ResponseBody
    public KesunReturn edit(@RequestBody Student student) {
        bll.setModel(student);
        KesunReturn kesunReturn = bll.editStu();
        return kesunReturn;
    }

    @PostMapping("showbypage")
    @ResponseBody
    @CrossOrigin
    public KesunReturn showbypage(@RequestBody Map<String,Object> cons) {
        Map<String, Object> con = new HashMap<>();
        con.put("myClass", cons.get("myClass"));
        con.put("name", cons.get("name"));
        con.put("id", cons.get("id"));
       int startpage=(int)cons.get("startpage");
        KesunReturn back = bll.findByPage(con, startpage, 10);
        return back;
    }

    @PostMapping("showbypagetotal")
    @ResponseBody
    public KesunReturn getshowpagetotal(@RequestBody Map<String, Object> conss) {
        Map<String, Object> con = new HashMap<>();
        con.put("myClass", conss.get("myClass"));
        con.put("name", conss.get("name"));
        con.put("id", conss.get("id"));
        KesunReturn back = bll.getRowscount(con);
        return back;
    }
    @PostMapping("delstu")
    @ResponseBody
    public KesunReturn delstu(@RequestBody Map<String, Object> cons) {
        Student student = new Student();
        System.out.println("id"+cons.get("id"));
        student.setId(String.valueOf(cons.get("id")));
        System.out.println(student.getId());
        bll.setModel(student);
        KesunReturn back = bll.delete();
        return back;
    }
}
