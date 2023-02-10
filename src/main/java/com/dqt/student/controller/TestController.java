package com.dqt.student.controller;

import com.dqt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;

@Controller
public class TestController {
    @Autowired
    private StudentService studentService;

//    1.GET   index()                 URL("")
//    2.GET   create()                URL("/add")
//    3.POST  save(Request)           URL("/add")
//    4.GET   show(ID)                URL("/show/ID")
//    5.GET   edit(ID)                URL("/update/ID")
//    6.POST  update(Request,ID)      URL("update/ID")
//    7.GET   delete(ID)              URL("/delete/ID")







}
