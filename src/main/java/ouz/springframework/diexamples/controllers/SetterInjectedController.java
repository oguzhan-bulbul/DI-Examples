package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.GreetingService;
@Controller
public class SetterInjectedController {

    // Di without SpringFramework


    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){

        return "Setter " +greetingService.sayGreeting();
    }
}
