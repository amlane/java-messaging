package com.lambda.part03InterfaceInjection;

public class EmailMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println("For: " + address + "\n" + "msg: " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
