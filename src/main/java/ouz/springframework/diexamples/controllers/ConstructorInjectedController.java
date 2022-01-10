package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.GreetingService;
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){

        return "Constructor " +  greetingService.sayGreeting();
    }
}
