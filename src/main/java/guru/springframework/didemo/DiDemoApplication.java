package guru.springframework.didemo;

import guru.springframework.didemo.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);


        System.out.println(ctx.getBean(i18nController.class).sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        // 3 строки сверху можно записать в одну строку
//        SpringApplication.run(DiDemoApplication.class,args).getBean(MyController.class).hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
