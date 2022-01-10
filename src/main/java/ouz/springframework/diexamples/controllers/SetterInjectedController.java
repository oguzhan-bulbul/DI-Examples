package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.IGreetingService;
import ouz.springframework.diexamples.services.PropertyInjectedGreetingService;
@Controller
public class SetterInjectedController {

    // Di without SpringFramework


    private IGreetingService greetingService;
    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(IGreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
