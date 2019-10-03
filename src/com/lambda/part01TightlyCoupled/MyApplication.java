package com.lambda.part01TightlyCoupled;


// business rules
public class MyApplication
{
    private MessageService msgSrv = new MessageService();

    public void send(String msg, String addr)
    {
        // rules of messaging
        msg = msg + "\n*** FOR YOUR EYES ONLY ***";

        msgSrv.sendMessage(msg, addr);
    }
}
