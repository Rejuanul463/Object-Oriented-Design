public class Main{    
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification sms = notificationFactory.getNotificationType("smsnotification");
        sms.notifyUser("This is a SMS");

        Notification email = notificationFactory.getNotificationType("EmailNotification");
        email.notifyUser("This is an Email");

        Notification push = notificationFactory.getNotificationType("pushNotification");
        push.notifyUser("This is a push notification");
    }
}