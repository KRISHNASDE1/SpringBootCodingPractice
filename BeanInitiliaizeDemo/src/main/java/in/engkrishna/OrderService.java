package in.engkrishna;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class OrderService {
      PaymentService paymentService;
  //@Lazy
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service is Created!!");
    }
public void placeOrder(){
        paymentService.pay();
    System.out.println("Ordered Placed!!");
}
    public  void getOrderDetails(){
        System.out.println("Ordered Details!!");
    }


}
