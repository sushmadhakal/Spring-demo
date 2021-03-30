package com.vastika.demo.test;

import com.vastika.demo.controller.MessageController;

public class MessageTest {
    public static void main(String[] args) {
        MessageController con = new MessageController();
        con.sendMessage("hello");
    }
}
