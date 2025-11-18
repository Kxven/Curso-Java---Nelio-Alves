package main.withoutAddictionInjection;

public class EmailService implements MessageService{
    @Override
    public void sendMessage( String message ){
        System.out.println("Enviando email" + message);
    }
}
