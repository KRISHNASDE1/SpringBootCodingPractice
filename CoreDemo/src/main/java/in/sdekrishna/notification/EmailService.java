package in.sdekrishna.notification;

public class EmailService implements  notificationService{


    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
