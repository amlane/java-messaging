package com.lambda.part03InterfaceInjection;

public class MyApplication implements Processor
{
    // constructor injections
    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    public void sendMessage(String msg, String receiveAddress)
    {
        // rules of messaging
        msg = msg + "\n *** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(msg, receiveAddress);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}