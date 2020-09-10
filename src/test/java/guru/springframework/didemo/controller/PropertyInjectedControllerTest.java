package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.PropertyInjectedService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController ;

    @Before
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl=new PropertyInjectedService();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(PropertyInjectedService.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
