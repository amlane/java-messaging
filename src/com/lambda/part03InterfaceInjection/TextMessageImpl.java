package com.lambda.part03InterfaceInjection;

public class TextMessageImpl implements MessageService
{
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println(message + "---" + address);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
