package com.lvjinke.bit.FactoryMethod;

public class Context {
    public static void main(String[] args){
        HumanFactory factory = new HumanFactory();
        Human human = factory.creatHuman(YellowMan.class);

        human.getColor();
        human.talk();
        Human human1 = factory.creatHuman(BlackMan.class);
        human1.talk();
        human1.getColor();
        //SingleHumanFactory shf = new SingleHumanFactory();
        Human human2 = SingleHumanFactory.creatHuman(BlackMan.class);
        human2.getColor();
        human2.talk();
    }
}
