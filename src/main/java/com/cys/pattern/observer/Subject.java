package com.cys.pattern.observer;

/**
 * 主题接口
 * @author cys
 */
public interface Subject {
    // 注册一个观察者
    public void registerObserver(Observer observer);
    // 移除一个观察者
    public void removeObserver(Observer observer);
    // 通知所有观察者
    public void notifyObserver();
}
