package com.sahu;

import com.sahu.controllers.ConstructorInjectedController;
import com.sahu.controllers.GetterInjectedController;
import com.sahu.controllers.MyController;
import com.sahu.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext  context = SpringApplication.run(DependencyinjectionApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		myController.Hello();

		//System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(context.getBean(GetterInjectedController.class).sayHello());
	}
}
