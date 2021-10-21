package com.spring.secondapp;

import lombok.Data;

@Data
public class studentdetails {

    private String fname;
    private String lname;

    public studentdetails(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}


