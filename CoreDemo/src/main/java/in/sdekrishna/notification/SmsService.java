package in.sdekrishna.notification;

public class SmsService implements notificationService {


    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent");
    }
}
