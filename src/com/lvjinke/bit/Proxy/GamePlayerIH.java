package com.lvjinke.bit.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler{
    Class cl = null;
    Object obj = null;
    public GamePlayerIH(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        if(method.getName().equals("login")){
            System.out.println("someone is logging");
        }
        if(method.getName().equalsIgnoreCase("upgrade")){
            System.out.println("the fee is 10$");
        }
        return result;
    }
}
