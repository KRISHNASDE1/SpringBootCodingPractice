package in.engkrishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       // ApplicationContext
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       OrderService orderService = context.getBean(OrderService.class);
//           UserService userService = context.getBean(UserService.class);
//           userService.setBeanName("Bean2");

//         orderService.placeOrder();
//      AppConfig appConfig = context.getBean(AppConfig.class);
//      appConfig.demo();
//        CartService service = context.getBean(CartService.class);
//        System.out.println(service.getValue(1));
//        context.close();
    }
}