package ouz.springframework.diexamples.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {



    public String sayHello(){
        System.out.println("Hello Mars!!!");
        return "Hi guys..!";
    }
}
