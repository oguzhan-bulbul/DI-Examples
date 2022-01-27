package ouz.springframework.diexamples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import ouz.springframework.diexamples.services.*;

@Configuration
public class GreetingServiceConfig {
    @Profile("TR")
    @Bean("i18nService")
    public I18NTurkishGreetingService i18NTurkishGreetingService(){
        return new I18NTurkishGreetingService();
    }
    @Profile({"EN","default"})
    @Bean
    public I18NEnglishGreetingService i18nService(){
        return new I18NEnglishGreetingService();
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