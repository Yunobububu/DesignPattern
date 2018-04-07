package com.lvjinke.bit.Decorator;

public class ConcreateDecorator2 extends Decorator{

    public ConcreateDecorator2(){}

    public ConcreateDecorator2(Component com){
        super(com);
    }
    private void method(){
        System.out.println("the 2nd decorator");
    }

    @Override
    public void operate(){
        this.method();
        super.operate();
    }

}
