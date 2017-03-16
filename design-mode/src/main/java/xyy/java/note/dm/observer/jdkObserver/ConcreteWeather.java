package xyy.java.note.dm.observer.jdkObserver;

import java.util.Observable;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConcreteWeather extends Observable{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //通知所有的观察者
        this.setChanged();
        this.notifyObservers(content);

    }
}
