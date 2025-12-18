package com.expample.demo.controller;

import org.springframe.web.bind.annotation.*;
import jakarta.validation.Vaild;
 
import java.util.*;

import com.example.demo.entity.*;
import com.example.service.studentservice;
@RestConroller


public class studentController{
    @Autowired
    studentService service;

    @GetMapping("/getallservice")
    public list<studentEntity>getAll(){
        return service.getall();
    }
    @posMapping("/add")

    public studentEntity addstudent(@Valid @requestBody studentEntity student){
        return service.addStudent(student);
    }
}