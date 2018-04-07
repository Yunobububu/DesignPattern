package com.lvjinke.bit.Decorator;

public class ConcreateDecorator extends Decorator{

    public ConcreateDecorator(){}

    public ConcreateDecorator(Component com){
        super(com);

    }

    private void method1(){
        System.out.println("first decorator is here");
    }

    private void method2(){
        System.out.println("still in the first");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
        this.method2();
    }
}
