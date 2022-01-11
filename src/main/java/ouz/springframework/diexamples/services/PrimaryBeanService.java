package ouz.springframework.diexamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryBeanService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Primary Bean Service";
    }
}
