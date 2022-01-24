package ouz.springframework.diexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN","default"})  //default means if there is no profile determined use this profile as a default.
@Service("i18nService")
public class I18NEnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Bro - EN";
    }
}
