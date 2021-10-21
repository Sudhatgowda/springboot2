package com.spring.secondapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentcontroller {

    @RequestMapping("/first")
    public student getdata(){

       // student s1=new student();
       // s1.fname = " Sachin ";
       // s1.lname = " Tendulkar ";
       // return s1;

        return new student("RAMESH", "PATEL");
    }
    @GetMapping("{fname}/{lname}")
    public student getdata1(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
        return new student("GANESH", "PATEL");
    }

    @GetMapping("/studentquery")
    public student getdata2(@RequestParam(name = "fname") String fname, @RequestParam(name = "lname") String lname){
        return new student(fname,lname);
    }
}

