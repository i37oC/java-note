package xyy.java.note.dm.observer.webObserverPattern;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        // 创建观察者
        ConcreateObserver girl = new ConcreateObserver();
        girl.setObserverName("女朋友");
        girl.setRemindThing("约会， 不见不散");

        ConcreateObserver mum = new ConcreateObserver();
        mum.setObserverName("mum");
        mum.setRemindThing("买东西");

        // 注册观察者
        subject.attach(girl);
        subject.attach(mum);

        // 在目标处发布天气
        subject.setWeatherContent("天气晴朗");
        subject.notifyObservers();
    }
}
