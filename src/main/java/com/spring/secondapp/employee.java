package com.spring.secondapp;

import lombok.Data;

@Data
public class employee {

    //below steps for public
    // public String name;
    // public int empid;
    // public String dept;
    // public String city;

  private String name;
  private int empid;
  private String dept;
  private String city;

    public employee(String name, int empid, String dept, String city) {
        this.name = name;
        this.empid = empid;
        this.dept = dept;
        this.city = city;
    }


}