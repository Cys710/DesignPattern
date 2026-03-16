package com.cys.pattern.observer;

public class ObserverUser implements Observer{
    public ObserverUser(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("User get msg");
    }
}
