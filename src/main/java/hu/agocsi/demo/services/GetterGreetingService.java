package hu.agocsi.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Getter Greeter injected";
    }
}
