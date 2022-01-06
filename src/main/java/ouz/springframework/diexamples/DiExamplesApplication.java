package ouz.springframework.diexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import ouz.springframework.diexamples.controllers.MyController;

@SpringBootApplication
public class DiExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExamplesApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController"); // Spring is defines MyController object for us.

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
