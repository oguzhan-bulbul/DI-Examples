package ouz.springframework.diexamples.services;


public class I18NTurkishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Merhaba  - TR ";
    }
}
