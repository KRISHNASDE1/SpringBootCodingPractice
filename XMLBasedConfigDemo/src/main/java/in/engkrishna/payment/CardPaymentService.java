package in.engkrishna.payment;

public class CardPaymentService implements PaymentService {

    @Override
    public void pay(){
        System.out.println("Payment Done by Credit Card!!");
    }
}
