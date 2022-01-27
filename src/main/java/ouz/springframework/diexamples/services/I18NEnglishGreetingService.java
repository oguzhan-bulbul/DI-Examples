package ouz.springframework.diexamples.services;



public class I18NEnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Bro - EN";
    }
}
