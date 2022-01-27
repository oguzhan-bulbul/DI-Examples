package ouz.springframework.diexamples.services;

import org.springframework.stereotype.Service;


public class PropertyInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello to Property Injected Greeting Service";
    }
}
