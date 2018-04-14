package com.lvjinke.bit.Proxy;


public class ConcreteSubject implements Subject {

    @Override
    public void execute() {
        System.out.println("Do something");
    }
}
