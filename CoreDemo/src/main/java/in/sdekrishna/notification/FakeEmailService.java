package in.sdekrishna.notification;

public class FakeEmailService implements  notificationService{


    @Override
    public void sendNotification() {
        System.out.println("Dummy Email sent");
    }
}
