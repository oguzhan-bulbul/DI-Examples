package ouz.springframework.diexamples.controllers;

import ouz.springframework.diexamples.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
