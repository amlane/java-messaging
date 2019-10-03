package com.lambda.part03InterfaceInjection;

public interface MessageService
{
    void sendMessage(String message, String address);
    String readMessage();
}
