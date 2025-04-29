public class PushNotification implements Notification{
    @Override
    public void notifyUser(String massage){
        System.out.println("New Push: " + massage);
    }
}
