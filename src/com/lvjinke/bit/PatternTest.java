package com.lvjinke.bit;

public class PatternTest {

    public static void main(String[] args){
        Context context = null;
        System.out.println("use the first stratety");
        context = new Context(new IStrategyOne());
        context.operate();
        System.out.println("use the second stratety");
        context = new Context(new IStrategyTwo());
        context.operate();
        System.out.println("use the third stratety");
        context = new Context(new IStrategyThree());
        context.operate();
    }




}
