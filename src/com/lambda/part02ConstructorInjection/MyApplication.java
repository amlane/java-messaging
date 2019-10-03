package com.lambda.part02ConstructorInjection;

public class MyApplication
{
    private MessageService msgSrv;

    // constructor (created by right click + generate)
    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    public void send(String msg, String receiveAddress)
    {
        msg = msg + "\n ***FOR YOUR EYES ONLY***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
