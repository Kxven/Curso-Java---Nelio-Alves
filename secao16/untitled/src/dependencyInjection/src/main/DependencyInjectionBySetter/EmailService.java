package main.DependencyInjectionBySetter;

public class EmailService implements MessageService{
    @Override
    public void sendMessage( String message ){
        System.out.println("Send email " + message);
    }
}
