package com.cursoNelio;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    public void sendMessage( String message ){
        System.out.println("Send Email " + message);
    }
}
