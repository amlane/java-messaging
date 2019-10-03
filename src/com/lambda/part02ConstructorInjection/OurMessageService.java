package com.lambda.part02ConstructorInjection;

public class OurMessageService extends MessageService
{
    // right click + generate + override + select which ones you want
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println("FOR " + address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not implemented";
    }
}
