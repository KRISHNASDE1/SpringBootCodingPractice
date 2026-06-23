package in.engkrishna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private  PaymentService paymentService;


//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }


    public void placedOrder(){
        paymentService.pay();
        getOrderDetails();
        System.out.println("Ordered Placed");
    }
    public void getOrderDetails(){
        System.out.println("Ordered Details!!");
    }
}
