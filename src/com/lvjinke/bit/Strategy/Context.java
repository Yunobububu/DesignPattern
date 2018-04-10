package com.lvjinke.bit.Strategy;

public class Context {
    private IStrategy is = null;
    Context(IStrategy iStrategy){
        this.is = iStrategy;
    }
    public void operate(){
        this.is.operate();
    }
}
