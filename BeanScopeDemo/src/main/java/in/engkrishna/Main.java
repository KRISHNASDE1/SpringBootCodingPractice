package in.engkrishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//      OrderService orderService = context.getBean(OrderService.class);
//     OrderService orderService1 =context.getBean(OrderService.class);
//
//        System.out.println(orderService==orderService1);

    }
}