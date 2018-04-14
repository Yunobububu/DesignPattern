package com.lvjinke.bit.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static <T> T newInstance(Subject sub){
        ClassLoader cl = sub.getClass().getClassLoader();
        Class[] interfaces = sub.getClass().getInterfaces();
        InvocationHandler in = new MyInvocationHandler(sub);
        if(true){
            new BeforeAdvice().execute();
        }
        T result = (T)Proxy.newProxyInstance(cl,interfaces,in);
        return result;
    }
}
