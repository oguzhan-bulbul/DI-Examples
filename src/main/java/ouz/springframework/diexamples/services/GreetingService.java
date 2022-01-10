package ouz.springframework.diexamples.services;

public class GreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
