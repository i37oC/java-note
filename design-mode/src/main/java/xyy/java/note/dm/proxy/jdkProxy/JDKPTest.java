package xyy.java.note.dm.proxy.jdkProxy;

import xyy.java.note.dm.proxy.Car;
import xyy.java.note.dm.proxy.Moveable;

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
