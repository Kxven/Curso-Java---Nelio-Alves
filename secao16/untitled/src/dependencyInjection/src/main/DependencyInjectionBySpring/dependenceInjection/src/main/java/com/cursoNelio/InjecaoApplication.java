package com.cursoNelio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaoApplication implements CommandLineRunner{
    private final NotificationManager notificationManager;

    @Autowired
    public InjecaoApplication( NotificationManager notificationManager ){
        this.notificationManager = notificationManager;
    }

    public static void main( String[] args ){
        SpringApplication.run( InjecaoApplication.class, args);
    }

    @Override
    public void run( String... args ) throws Exception{

            notificationManager.notify("Olá mundo com Spring!");
        }
    }
