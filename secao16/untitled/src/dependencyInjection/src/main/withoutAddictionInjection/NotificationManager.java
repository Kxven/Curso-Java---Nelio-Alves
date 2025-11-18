package main.withoutAddictionInjection;

public class NotificationManager{
    //Forte acoplamento, a propria classe está instanciando a dependência!
    private EmailService emailService = new EmailService();

    public void notify(String message){
        emailService.sendMessage(message);
    }
}
