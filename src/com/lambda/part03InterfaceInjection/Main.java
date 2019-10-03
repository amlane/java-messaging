package com.lambda.part03InterfaceInjection;

public class Main
{

    String myMsg = "Hello";
    String myAddress = "123 N Pole";
    String myTextAddr = "5733531234";

    // shortcut: psvm <tab>
    public static void main(String[] args)
    {
        MessageServiceInjector injector;
        Processor app;

        // send message
        injector = new LambdaMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Hello", "Amanda Lane");
        System.out.println("\n\n\n");
        // send message
        injector = new EmailMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Hi", "twelvexstring@gmail.com");
        System.out.println("\n\n\n");
        // send message
        injector = new TextMessageInjector();
        app = injector.getProcess();
        app.sendMessage("Good Bye", "573-313-1234");
    }
}
