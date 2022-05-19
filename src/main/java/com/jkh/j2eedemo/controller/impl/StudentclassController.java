package com.jkh.j2eedemo.controller.impl;

import com.jkh.j2eedemo.controller.inter.stuClassInter;
import com.jkh.j2eedemo.entity.Student;
import com.jkh.j2eedemo.entity.StudentClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("studentclass")
public class StudentclassController implements stuClassInter {
    @RequestMapping(value = "getme",method = RequestMethod.POST)
    public void dogetme(StudentClass sc){
        System.out.println("班级:"+sc.getName());
        for (Student stu: sc.getStus()) {
            System.out.println("学号:"+stu.getSno()+"姓名:"+stu.getName());
        }
    }
    @RequestMapping("sc")
    public String stuclass(){
        return "studentclass";
    }
}
