package ouz.springframework.diexamples.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ouz.springframework.diexamples.services.GreetingService;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    // Di without SpringFramework

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingService());
    }

    @Test
    void getGreeting() {
        System.out.print(controller.getGreeting());
    }
}