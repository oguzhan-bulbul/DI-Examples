package ouz.springframework.diexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ouz.springframework.diexamples.services.IGreetingService;
@Controller
public class I18nController {
    private final IGreetingService greetingService;
    @Autowired
    public I18nController(@Qualifier("i18nService")IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
