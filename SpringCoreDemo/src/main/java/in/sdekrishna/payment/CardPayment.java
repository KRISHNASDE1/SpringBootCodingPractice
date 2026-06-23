package in.sdekrishna.payment;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("cp")
public class CardPayment implements PaymentService {
   @Override
    public void pay(){
       System.out.println("Payment done by Card!!");
   }
}
