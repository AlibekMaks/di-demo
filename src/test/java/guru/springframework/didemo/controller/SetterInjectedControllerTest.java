package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.PropertyInjectedService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController ;

    @Before
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new PropertyInjectedService());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(PropertyInjectedService.HELLO_GURUS,setterInjectedController.sayHello());
    }
}
