package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.IGreetingService;
import ouz.springframework.diexamples.services.PropertyInjectedGreetingService;
@Controller
public class PropertyInjectedController {

    // Di without SpringFramework
    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    public IGreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
