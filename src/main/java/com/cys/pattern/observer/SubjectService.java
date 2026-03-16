package com.cys.pattern.observer;

import java.util.ArrayList;

/**
 * 主题服务类
 * @author cys
 */
public class SubjectService implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    /**
     * 消息
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(msg);
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyObserver();
    }
}
