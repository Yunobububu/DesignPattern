package com.lvjinke.bit.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyClient {
    public static void execute(){
        IGamePlayer iGamePlayer = new GamePlayer("joh snow");
        //GamePlayerProxy proxy = new GamePlayerProxy(iGamePlayer);
        InvocationHandler invocationHandler = new GamePlayerIH(iGamePlayer);
        ClassLoader cl = iGamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},invocationHandler);
        proxy.login("little finger" ,"23200");
        proxy.killBoss();
        proxy.upgrade();
        Subject subject = new ConcreteSubject();
        Subject proxy2 = DynamicProxy.newInstance(subject);
        proxy2.execute();
    }

}
