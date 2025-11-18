package main.DependencyInjectionByBuilder;

import main.DependencyInjectionByBuilder.MessageService;

public class NotificationManager{
    private MessageService messageService;

    public NotificationManager( MessageService messageService ){
        this.messageService = messageService;
    }

    public void notify( String message){
        messageService.sendMessage(message);
    }
}
