package guru.springframework.didemo.services;


import org.springframework.stereotype.Service;

@Service
public class TestImple implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, testImple";
    }
}
