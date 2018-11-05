package guru.springframework.didemo.controller;

import guru.springframework.didemo.DiDemoApplication;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("hello");
        return  "foo";
    }
}
