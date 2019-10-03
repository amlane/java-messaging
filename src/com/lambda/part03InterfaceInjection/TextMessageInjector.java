package com.lambda.part03InterfaceInjection;

public class TextMessageInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TextMessageImpl());
    }
}