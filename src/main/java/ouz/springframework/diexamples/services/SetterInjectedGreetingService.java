package ouz.springframework.diexamples.services;

import org.springframework.stereotype.Service;


public class SetterInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello to Setter Injected Greeting Service";
    }
}
