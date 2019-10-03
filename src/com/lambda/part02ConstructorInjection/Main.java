package com.lambda.part02ConstructorInjection;

public class Main
{
    // shortcut: psvm <tab>
    public static void main(String[] args)
    {
        MyApplication ourmessaging = new MyApplication(new OurMessageService());
        ourmessaging.send("Hello", "amanda@email.com");

        MyApplication yourmessaging = new MyApplication(new YourMessageService());
        yourmessaging.send("Goodbye", "amanda@email.com");
    }
}
