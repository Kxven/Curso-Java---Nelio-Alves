package main.withoutAddictionInjection;

public class Main{
    public static void main( String[] args ){
        //NotificationManager está preso ao EmailService. Se precisarmos trocar por um SMS service temos que altera o código da classe.
        NotificationManager manager = new NotificationManager();
        manager.notify(" Olá mundo");
    }
}
