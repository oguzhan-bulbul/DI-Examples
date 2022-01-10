package ouz.springframework.diexamples.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
