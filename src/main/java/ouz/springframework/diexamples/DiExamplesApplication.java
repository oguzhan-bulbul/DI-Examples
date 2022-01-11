package ouz.springframework.diexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import ouz.springframework.diexamples.controllers.*;

@SpringBootApplication
public class DiExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExamplesApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController"); // Spring is defines MyController object for us.
		System.out.println(myController.sayHello());

		System.out.println("------------------------------------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("------------------------------------------");// Spring can't find the bean if we don't mark PropertyInjectedController class with Controller annotate.
		// Then we should mark greetingservice with autowired annotate because spring can't find greetingservice object without that.
		// We should mark GreetingService class with Service annotate for Spring so spring be able to  find greetingService instance.

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------------------------------------------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println("------------------------------------------");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("------------------------------------------");


	}

}
