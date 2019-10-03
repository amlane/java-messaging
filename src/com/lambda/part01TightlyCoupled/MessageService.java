package com.lambda.part01TightlyCoupled;

public class MessageService
{
    public void sendMessage(String message, String address)
    {
        System.out.println("FOR " + address + ": " + message);
    }

    public String readMessage()
    {
        return "Not implemented";
    }
}
