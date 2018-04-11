package com.lvjinke.bit.FactoryMethod;

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        T human = null;
        try{
            human = (T)Class.forName(c.getName()).newInstance();

        }catch (Exception e){
            System.out.println("class error");
        }
        return human;
    }
}
