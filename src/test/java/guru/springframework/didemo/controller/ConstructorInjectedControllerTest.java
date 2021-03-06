package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.PropertyInjectedService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController ;

    @Before
    public void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedService());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(PropertyInjectedService.HELLO_GURUS,constructorInjectedController.sayHello());
    }

}
