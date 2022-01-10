package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.GreetingService;
@Controller
public class PropertyInjectedController {

    // Di without SpringFramework
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return "Property " + greetingService.sayGreeting();
    }
}
