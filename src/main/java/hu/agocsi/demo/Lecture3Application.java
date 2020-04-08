package hu.agocsi.demo;

import hu.agocsi.demo.controllers.ConstructorInjectedController;
import hu.agocsi.demo.controllers.GetterInjectedController;
import hu.agocsi.demo.controllers.MyController;
import hu.agocsi.demo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Lecture3Application.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
