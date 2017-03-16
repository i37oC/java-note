package xyy.java.note.dm.observer.jdkObserver;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
            // 创建一个目标
            ConcreteWeather subject = new ConcreteWeather();

            // 创建观察者
            ConreteObserver girl = new ConreteObserver();
            girl.setName("女朋友");

            ConreteObserver mum = new ConreteObserver();
            mum.setName("mum");

            // 注册观察者
            subject.addObserver(girl);
            subject.addObserver(mum);

            // 在目标处发布天气
            subject.setContent("天气晴朗");
    }
}
