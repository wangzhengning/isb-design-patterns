package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * 观察者
 */
public interface Observer {
    public void update(float temperature , float humidity, float pressure);
}
