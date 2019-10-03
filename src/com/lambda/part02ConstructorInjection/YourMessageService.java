package com.lambda.part02ConstructorInjection;

public class YourMessageService extends MessageService
{
    // right click + generate + override + select which ones you want
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println(address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
