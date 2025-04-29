public class NotificationFactory {
    public Notification getNotificationType(String type){
        if(type.equalsIgnoreCase("SMSNotification")){
            return new SMSNotifiction();
        }else if(type.equalsIgnoreCase("EmailNotification")){
            return new EmailNotification();
        }else if(type.equalsIgnoreCase("PushNotification")){
            return new PushNotification();
        }else{
            return null;
        }
    }
}
