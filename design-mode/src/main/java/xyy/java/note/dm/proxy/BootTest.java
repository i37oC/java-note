package xyy.java.note.dm.proxy;

/**
 * Created by xyy on 2017/2/28.
 */
public class BootTest {
    public static void main(String[] args) {
        Car car = new Car();
        CarTimeProxy timeProxy = new CarTimeProxy(car);
        CarLogProxy logProxy = new CarLogProxy(timeProxy);
        logProxy.move();
    }
}
