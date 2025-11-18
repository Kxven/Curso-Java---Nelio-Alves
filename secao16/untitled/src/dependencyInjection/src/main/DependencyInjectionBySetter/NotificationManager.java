package main.DependencyInjectionBySetter;

public class NotificationManager{
    private MessageService messageService;

    public void setMessageService( MessageService messageService ){
        this.messageService = messageService;
    }

    public void notify(String message){
        messageService.sendMessage(message);
    }
}
