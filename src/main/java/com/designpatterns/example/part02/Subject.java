package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * 主题
 */
public interface Subject {
    public void registerObserver(Observer registerObserver);
    public void removeObserver(Observer removeObserver);
    public void notifyObserver();
}
