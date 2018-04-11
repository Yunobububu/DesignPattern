package com.lvjinke.bit.FactoryMethod;

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public Human creatHuman(Class c) {
        Human human = null;
        try{
            human = (Human)Class.forName(c.getName()).newInstance();

        }catch (Exception e){
            System.out.println("class error");
        }
        return human;
    }
}
