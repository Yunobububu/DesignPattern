package com.lvjinke.bit.FactoryMethod;

public class BlackMan implements Human{
    @Override
    public void getColor() {
        System.out.println("skin is black");
    }

    @Override
    public void talk() {
        System.out.println("Speak local language˜");
    }
}
