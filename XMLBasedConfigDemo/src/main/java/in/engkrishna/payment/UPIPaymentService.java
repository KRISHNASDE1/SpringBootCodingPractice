package in.engkrishna.payment;

public class UPIPaymentService implements PaymentService{

    @Override
    public void pay(){
        System.out.println("Payment Done by UPI");
    }
}
