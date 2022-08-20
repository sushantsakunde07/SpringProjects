package com.bridgelabz.springprojects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@ComponentScan(basePackages = {"resources"})
public class HelloWorldWebController  {
//    @Autowired
//    private User user;
    @RequestMapping ("/web")
   // @ResponseBody
    public String hello(){
        System.out.println("Hii");
        //this.user.setName("Sushant");
    return "hello.html";
    }
//    @Override
//    public void run(String... args) throws Exception {
//       this.user.setName("Sushant");
//    }
}