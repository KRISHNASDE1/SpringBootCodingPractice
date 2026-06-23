package in.sdekrishna;

import in.engkrishna.CardService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      OrderService  service = context.getBean(OrderService.class);
      service.placeOrder();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());

//       CardService service = context.getBean(CardService.class);
//        service.addToCart();

//        PaymentService paymentService = context.getBean(PaymentService.class);
//           paymentService.pay();
    }
}