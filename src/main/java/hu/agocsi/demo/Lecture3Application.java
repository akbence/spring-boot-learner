package hu.agocsi.demo;

import hu.agocsi.demo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Lecture3Application.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
    }
}
