package ouz.springframework.diexamples.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ouz.springframework.diexamples.services.PropertyInjectedGreetingService;

class SetterInjectedControllerTest {

    // Di without SpringFramework

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.print(controller.getGreeting());
    }
}