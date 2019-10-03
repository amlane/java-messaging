package com.lambda.part02ConstructorInjection;

public abstract class MessageService
{
    public abstract void sendMessage(String message, String address);

    public abstract String readMessage();
}
