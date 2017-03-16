package xyy.java.note.dm.observer;

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
public class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

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
     * 向所有注册的观察者发送消息
     */
    protected void notifyObservers(){
        observers.stream().forEach(observer -> {
            observer.update(this);
        });
    }

}
