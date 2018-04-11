package com.lvjinke.bit.FactoryMethod;

public abstract class Service {
    public Service(){}

    public void method1(){
        System.out.println("method1");
    }
    abstract void selfMethod();
}
