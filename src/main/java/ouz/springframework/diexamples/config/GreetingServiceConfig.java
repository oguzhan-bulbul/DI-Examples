package ouz.springframework.diexamples.config;

import com.ouz.pets.DogPetService;
import com.ouz.pets.PetService;
import com.ouz.pets.PetServiceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import ouz.springframework.diexamples.datasource.FakeDataSource;
import ouz.springframework.diexamples.repositories.EnglishGreetingRepository;
import ouz.springframework.diexamples.repositories.EnglishGreetingRepositoryImpl;
import ouz.springframework.diexamples.services.*;


@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${ouz.username}") String username
                                 ,@Value("${ouz.password}") String password
                                 ,@Value("${ouz.jdbcurl}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }


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
