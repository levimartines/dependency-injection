package com.levimartines.depinjection;

import com.levimartines.depinjection.controllers.ConstructorInjectedController;
import com.levimartines.depinjection.controllers.GetterInjectedController;
import com.levimartines.depinjection.controllers.MyController;
import com.levimartines.depinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepInjectionApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DepInjectionApplication.class, args);
    MyController controller = (MyController) ctx.getBean("myController");

    controller.hello();
    System.out.println(controller.hello());

    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
