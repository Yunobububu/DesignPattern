package com.lvjinke.bit.Proxy;

public class GamePlayer implements IGamePlayer{
    private String usr;
    public GamePlayer(){}
    public GamePlayer(String usr){
        this.usr = usr;
    }

    @Override
    public void login(String usr, String password) {
        if(!this.usr.equals(usr)){
            System.out.println("Attention: "+usr +"is loging your account");
        }
        System.out.println(usr +"is login");
    }

    @Override
    public void killBoss() {
        System.out.println("I'm killing boss");
    }

    @Override
    public void upgrade() {
        System.out.println("level plus one");

    }
}
