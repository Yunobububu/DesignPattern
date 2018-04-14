package com.lvjinke.bit.Proxy;

public class BeforeAdvice implements IAdvice {
    @Override
    public void execute() {
        System.out.println("This is before advice");
    }
}
