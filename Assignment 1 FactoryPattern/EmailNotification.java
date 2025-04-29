public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String massage){
        System.out.println("New Email: " + massage);
    }
}