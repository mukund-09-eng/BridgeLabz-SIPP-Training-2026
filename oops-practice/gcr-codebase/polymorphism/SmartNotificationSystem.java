class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

public class SmartNotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Mukund", "Welcome to our platform!"),
                new SMSNotification("Rahul", "Your OTP is 123456"),
                new PushNotification("Aman", "You have a new friend request")
        };

        System.out.println("----- Sending Notifications -----");

        for (Notification n : notifications) {
            n.sendNotification();
            System.out.println();
        }
    }
}
