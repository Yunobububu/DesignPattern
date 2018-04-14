package com.lvjinke.bit.Proxy;

public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer iGamePlayer = null;

    public GamePlayerProxy(){}
    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }
    @Override
    public void login(String usr, String password) {
        this.iGamePlayer.login(usr,password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
}
