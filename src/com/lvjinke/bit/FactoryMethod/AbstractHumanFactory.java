package com.lvjinke.bit.FactoryMethod;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
