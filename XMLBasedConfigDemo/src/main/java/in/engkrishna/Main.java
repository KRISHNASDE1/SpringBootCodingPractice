package in.engkrishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        // get bean by Id/name
      //  OrderService orderService = (OrderService) context.getBean("orderService");
      //orderService.placeOrder();
         // get bean by Type
//      OrderService orderService1 =
//              context.getBean("orderService",OrderService.class);
//        orderService1.placeOrder();
    UserService userService = context.getBean(UserService.class);
      context.close();
       // System.out.println(userService.getUsernames());
    }
}

/*
  PaymentService paymentService = context.getBean("paymentService",PaymentService.class);
        paymentService.pay();
        orderService1.placeOrder();

* */