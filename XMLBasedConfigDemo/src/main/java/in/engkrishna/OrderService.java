package in.engkrishna;

import in.engkrishna.payment.PaymentService;

public class OrderService {

  private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }


    public void placeOrder(){
        paymentService.pay();
        System.out.println("Placed Ordered!!");
    }
}
