package main.DependencyInjectionBySetter;

public class Main{
    public static void main( String[] args ){
        NotificationManager manager = new NotificationManager();
        manager.setMessageService(new EmailService());
        manager.notify("Hellow world by Setter");
    }
}
