package com.spring.secondapp;

import lombok.Data;

@Data
public class student {

    private String fname;
    private String lname;

    public student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}