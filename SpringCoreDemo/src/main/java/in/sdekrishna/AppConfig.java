package in.sdekrishna;

import in.engkrishna.CardService;
import in.sdekrishna.payment.CardPayment;
import in.sdekrishna.payment.PaymentService;
import in.sdekrishna.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.sdekrishna")
public class AppConfig {

     @Bean
    public User createUser(){
          return new User("krishna",26);
    }
    @Bean
    public CardService createCartService(){
          return  new CardService();
    }

    @Bean
    //@Primary
    @Qualifier("cp")
    public PaymentService createCardPayment(){
         return  new CardPayment();
    }
    @Bean
    @Qualifier("upi")
    public UpiPayment createUpiPayment(){
         return new UpiPayment();
    }
    @Bean
    public OrderService createOrderService(@Qualifier("upi")PaymentService paymentService){
         return  new OrderService(paymentService);
    }
}
