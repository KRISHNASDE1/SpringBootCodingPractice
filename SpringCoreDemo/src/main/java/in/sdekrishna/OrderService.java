package in.sdekrishna;


import in.sdekrishna.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
 //   @Autowired
 private  final PaymentService paymentService;

 //@Autowired  @Qualifier("up")
  public OrderService( PaymentService paymentService){
      this.paymentService = paymentService;
  }

//   @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Placed order successFully!!");
    }
}
