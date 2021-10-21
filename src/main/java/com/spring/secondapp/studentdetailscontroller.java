package com.spring.secondapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentdetailscontroller {

    @RequestMapping("/list")
    public List<studentdetails> getstudentsdetailslist() {
        List<studentdetails> studentslist = new ArrayList<>();

        studentslist.add(new studentdetails("RAJEEV", "GUPTA"));
        studentslist.add(new studentdetails("ABHIJITH", "GOWDA"));
        studentslist.add(new studentdetails("NIKHIL", "KUMAR"));
        studentslist.add(new studentdetails("LOHITH", "PATEL"));
        studentslist.add(new studentdetails("ANKITH", "SHARMA"));

        return studentslist;

    }
}
