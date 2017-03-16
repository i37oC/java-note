package xyy.java.note.dm.singleton;

/**
 * 单例模式： singleton
 * 类型模式：懒汉模式、饿汉模式
 *
 * 1、修改默认的构造方法 private
 *
 * @author xyy
 * @version 1.0 2017/3/8.
 * @since 1.0
 */
public class Singleton {
    //1、私有化构造方法，外部无法直接创建
    private Singleton() {
    }

    //2、自己的来创建一个实例，唯一
    private static Singleton singleton = new Singleton();

    private static Singleton singleton2;

    //3、提供一个用于获取实例的方法
    public static Singleton getInstance(){
        return singleton;
    }

    // 懒汉模式；线程不安全。
    public static Singleton getInstance2(){
        if(singleton2==null){
            singleton2 = new Singleton();
        }
        return singleton2;
    }
}
