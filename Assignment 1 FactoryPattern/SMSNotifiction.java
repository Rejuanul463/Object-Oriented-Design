public class SMSNotifiction implements Notification{
    @Override
    public void notifyUser(String massage){
        System.out.println("New SMS: " + massage);
    }
}
