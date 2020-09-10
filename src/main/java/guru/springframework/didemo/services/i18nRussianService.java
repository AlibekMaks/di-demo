package guru.springframework.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("RU")
public class i18nRussianService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, Russian service";
    }
}
