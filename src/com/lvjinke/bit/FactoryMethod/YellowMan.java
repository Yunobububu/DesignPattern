package com.lvjinke.bit.FactoryMethod;

public class YellowMan implements Human {
    @Override
    public void getColor() {
        System.out.println("skin is yellow");
    }

    @Override
    public void talk() {
        System.out.println("speak chinese˜");
    }
}
