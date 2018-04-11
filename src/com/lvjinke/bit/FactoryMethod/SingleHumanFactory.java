package com.lvjinke.bit.FactoryMethod;

public class SingleHumanFactory {
    public static <T extends Human>T creatHuman(Class<T> c){
        T human = null;
        try{
            human = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return human;
    }
}
