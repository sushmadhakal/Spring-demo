package com.vastika.demo.controller;

import com.vastika.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    //Dependency injection field based method
    @Autowired
    @Qualifier("textService")
   private MessageService messageService;

   //Dependency injection with set method
    //@Autowired
   // public void setMessageService(MessageService messageService){
    //    this.messageService = messageService;
  //  }

    //Dependency Injection with constructor method
//    public MessageController(MessageService messageService){
//        this.messageService = messageService;
//    }

   public void sendMessage(String message){
        messageService.send("Hello");
  }
}
