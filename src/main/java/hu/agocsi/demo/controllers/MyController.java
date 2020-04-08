package hu.agocsi.demo.controllers;

import hu.agocsi.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class  MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello World!");
        return greetingService.sayGreeting();
    }
}
