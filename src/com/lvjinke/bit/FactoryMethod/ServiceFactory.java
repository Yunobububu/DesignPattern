package com.lvjinke.bit.FactoryMethod;

public  abstract class  ServiceFactory {

    public  abstract  <T extends Service> T  creatService(Class<T> c);
}
