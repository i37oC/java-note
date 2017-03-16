package xyy.java.note.dm.observer.webObserverPattern;

/**
 * 具体观察者对象，实现更新的方法，使自身状态和目标状态保持一致
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConcreateObserver implements Observer {
    //观察者的名字，是谁收到了内容
    private String observerName;

    //天气内容，从目标处获取
    private String weatherContent;

    //天气内容
    private String remindThing;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    @Override
    public void update(WeatherSubject subject) {
        ConcreteWeatherSubject concreteSubject = (ConcreteWeatherSubject) subject;
        weatherContent = concreteSubject.getWeatherContent();
        System.out.println(observerName + " 收到了 " + weatherContent + "," + remindThing);
    }
}
