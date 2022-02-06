package ouz.springframework.diexamples.config;

import com.ouz.pets.DogPetService;
import com.ouz.pets.PetService;
import com.ouz.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import ouz.springframework.diexamples.repositories.EnglishGreetingRepository;
import ouz.springframework.diexamples.repositories.EnglishGreetingRepositoryImpl;
import ouz.springframework.diexamples.services.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }
    @Profile({"dog","default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }
    @Profile({"cat"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }




    @Profile("TR")
    @Bean("i18nService")
    public I18NTurkishGreetingService i18NTurkishGreetingService(){
        return new I18NTurkishGreetingService();
    }
    @Bean
    public EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
    @Profile({"EN","default"})
    @Bean
    public I18NEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18NEnglishGreetingService(englishGreetingRepository);
    }
    @Primary
    @Bean
    public PrimaryBeanService primaryBeanService(){
        return new PrimaryBeanService();
    }
    @Bean
    public ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }
    @Bean
    public PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    @Bean
    public SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
