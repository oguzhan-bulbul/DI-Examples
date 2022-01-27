package ouz.springframework.diexamples.services;


public class PrimaryBeanService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Primary Bean Service";
    }
}
