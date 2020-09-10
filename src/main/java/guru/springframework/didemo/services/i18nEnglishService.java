package guru.springframework.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class i18nEnglishService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello i18nEnglish Service";
    }
}
