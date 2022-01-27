package ouz.springframework.diexamples.services;


import ouz.springframework.diexamples.repositories.EnglishGreetingRepository;

public class I18NEnglishGreetingService implements IGreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }


    @Override
    public String sayGreeting() {
        return "Hello Bro - EN";
    }
}
