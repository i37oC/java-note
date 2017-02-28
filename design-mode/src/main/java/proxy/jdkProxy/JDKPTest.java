package proxy.jdkProxy;

import proxy.Car;
import proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by xyy on 2017/2/28.
 */
public class JDKPTest {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler invocationHandler  = new TimeHandler(car);
        Class<?> cls = car.getClass();
        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), invocationHandler);
        moveable.move();
    }
}
