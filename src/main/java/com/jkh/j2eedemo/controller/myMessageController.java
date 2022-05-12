package com.jkh.j2eedemo.controller;

import com.jkh.j2eedemo.entity.Student;
import com.jkh.j2eedemo.entity.StudentClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class myMessageController {
    @RequestMapping("mvc")
    public String showmymsg() {
        return "mvc";
    }


    //    测试请求
    @RequestMapping("request")
    @ResponseBody
    public Student request(HttpServletRequest request) {
        String name = request.getParameter("name");
        String sno = request.getParameter("sno");
        String clazz = request.getParameter("class");
        System.out.println("姓名" + name);
        System.out.println("学号" + sno);
        System.out.println("班级" + clazz);
        Student student = new Student();
        student.setSno(sno);
        student.setName(name);
        student.setMyClass(new StudentClass());
        student.getMyClass().setName(clazz);
        return student;
    }

    //    测试匹配变量名获取参数
    @RequestMapping("request2")
    public void request2(String name, String myclass) {
        System.out.println("姓名:" + name);
        System.out.println("班级:" + myclass);
    }
    @RequestMapping("request3")
    public void request3(@RequestParam(value = "name",required = true,defaultValue = "吉康辉") String name,
                         @RequestParam(value = "myclass",required = false,defaultValue = "03") String myclass) {
        System.out.println("姓名:" + name);
        System.out.println("班级:" + myclass);
    }
//rest风格
    @RequestMapping("restful/{name}/{myclass}")
    public void restful(@PathVariable(value = "name") String name,
                        @PathVariable(value = "myclass") String myclass) {
        System.out.println("rstful风格");
        System.out.println("姓名:" + name);
        System.out.println("班级:" + myclass);
    }
//pojo绑定
    @RequestMapping(value = "addstu",method= RequestMethod.POST)
    @ResponseBody
    public void addstudent(Student student){
        System.out.println("注册");
        System.out.println("姓名:"+student.getName());
        System.out.println("学号"+student.getSno());
    }
}
