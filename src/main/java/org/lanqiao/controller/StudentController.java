package org.lanqiao.controller;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/controller")
public class StudentController {
    //控制器依赖于Service
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {

        this.studentService = studentService;
    }

    @RequestMapping(value = "selete/{stuno}")
    public String queryStudentByNo(@PathVariable("stuno") Integer stuNO, Map<String,Object> map){
        System.out.println(stuNO);
        Student student= studentService.sletcttest(stuNO);
        map.put("student",student);
        return  "result";
    }

}
