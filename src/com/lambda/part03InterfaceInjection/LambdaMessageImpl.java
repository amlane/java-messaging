package com.lambda.part03InterfaceInjection;

public class LambdaMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println("For " + address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
