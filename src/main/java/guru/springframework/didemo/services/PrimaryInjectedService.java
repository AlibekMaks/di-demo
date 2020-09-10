package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service()
public class PrimaryInjectedService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hello primary service";
    }
}
