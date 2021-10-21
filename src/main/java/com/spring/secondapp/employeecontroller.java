package com.spring.secondapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class employeecontroller {

    @RequestMapping("/emp1")
    public employee getdata(){

    // below steps for public class
    //  employee a1=new employee();
    //  a1.name = "ARJUN";
    //  a1.empid = 1001;
    //  a1.dept = "ACCOUNTS";
    //   a1.city = "BANGALORE";
    //        return a1;
        //to run this in server http://localhost:8080/emp1

        return new employee("RAKESH",2002, "ADMINISTRATION", "MYSORE");
        // to run in server http://localhost:8080/emp1
    }

    @GetMapping("{name}/{empid}/{dept}/{city}")
    public employee getdata1(@PathVariable("name") String name,@PathVariable("empid") int empid, @PathVariable("dept") String dept, @PathVariable("city") String city){
    return new employee("ROSHAN", 3003, "HUMAN RESOURCE","MANGALORE");
    // to run in server http://localhost:8080/ROSHAN/3003/HUMAN%20RESOURCE/MANGALORE
    }


    @GetMapping("/empquery")
    public employee getdata3(@RequestParam(name = "name") String name, @RequestParam(name = "empid") int empid, @RequestParam(name = "dept") String dept, @RequestParam(name="city") String city){
        return new employee(name,empid,dept,city);
        //to run in server http://localhost:8080/empquery?name=sanjana&empid=5005&dept=logistic&city=bangalore
    }


}
