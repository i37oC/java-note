package xyy.java.note.dm.observer.webObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 * 它知道观察它的对象
 * 提供注册和删除观察的接口。
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class WeatherSubject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    // 吧订阅天气的人添加到列表中
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除集合中的观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有已经订阅了天气的人
     */
    protected void notifyObservers(){
        observers.stream().forEach(observer -> {
            observer.update(this);
        });
    }

}
