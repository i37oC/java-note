package xyy.java.note.dm.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConreteObserver implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 推的方式
        System.out.println(name + arg);

        ConcreteWeather weather = (ConcreteWeather)o;
        System.out.println(name + weather.getContent());
    }
}
