package in.sdekrishna;

import in.sdekrishna.notification.EmailService;
import in.sdekrishna.notification.FakeEmailService;
import in.sdekrishna.notification.SmsService;
import in.sdekrishna.notification.notificationService;

public class Main {
    public static void main(String[] args) {
        notificationService notification  = new FakeEmailService();
         //  OrderService orderService = new OrderService(notification);
          OrderService orderService = new OrderService();
        orderService.setNotification(notification);
        orderService.placeOrder();

        }
    }
