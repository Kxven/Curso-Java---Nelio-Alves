package main.DependencyInjectionByBuilder;

import main.DependencyInjectionByBuilder.EmailService;
import main.DependencyInjectionByBuilder.MessageService;
import main.DependencyInjectionByBuilder.NotificationManager;

public class Main{
    public static void main( String[] args ){
        //A dependencia é passada via construtor
        MessageService service = new EmailService();
        NotificationManager manager = new NotificationManager(service);
        manager.notify(" Hello World by constructor");
    }
}
