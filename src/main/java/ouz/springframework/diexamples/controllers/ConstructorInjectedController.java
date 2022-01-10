package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.IGreetingService;
import ouz.springframework.diexamples.services.PropertyInjectedGreetingService;
@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;
    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService")IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
