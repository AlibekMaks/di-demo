package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService {

    public static final String  HELLO_GURUS = "";

    @Override
    public String sayGreeting() {
        return "Hello, I was injected via property";
    }
}
