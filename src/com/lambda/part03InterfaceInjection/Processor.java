package com.lambda.part03InterfaceInjection;

public interface Processor
{
    void sendMessage(String msg, String address);
    String readMessage();
}
