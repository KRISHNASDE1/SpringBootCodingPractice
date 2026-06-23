package in.sdekrishna;

import in.sdekrishna.notification.EmailService;
import in.sdekrishna.notification.notificationService;

public class OrderService {

    notificationService notification = new EmailService();
    public OrderService(notificationService notification){
          this.notification = notification;
    }
    public OrderService(){

    }

    public void setNotification(notificationService notification) {
        this.notification = notification;
    }

    public void placeOrder(){
          System.out.println("ordered placed");
         notification.sendNotification();

       }
}
