package ouz.springframework.diexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("TR")
@Service("i18nService")
public class I18NTurkishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Merhaba  - TR ";
    }
}
