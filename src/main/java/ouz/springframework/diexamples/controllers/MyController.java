package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.IGreetingService;

@Controller
public class MyController {
    private final IGreetingService greetingService;
    @Autowired // Actually we dont need to use autowired in constructorDI
    public MyController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
