package ouz.springframework.diexamples.services;

import org.springframework.stereotype.Service;


public class ConstructorInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello to Constructor Injected Greeting Service";
    }
}
