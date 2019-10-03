package com.lambda.part01TightlyCoupled;

public class Main
{
    // shortcut: psvm <tab>
    public static void main(String[] args)
    {
        MyApplication messaging = new MyApplication();
        messaging.send("Hello", "amanda@email.com");
    }
}
