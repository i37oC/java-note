package xyy.java.note.dm.proxy.customJdkProxy;

/**
 * Created by xyy on 2017/2/28.
 *
 * 动态代理实现思路：
 * 实现功能：通过Proxy 的 newInstance 方法返回代理对象
 * 1、声明一段源码（动态产生代理）
 * 2、编译源码（JDK Compiler API）,产生新的类（代理类）
 * 3、将这个类 load 到内存当中，产生一个新的对象（代理对象）
 * 4、return 代理对象
 */
public class Proxy {
    public static Object newProxyInstance(){


        String filename = System.getProperty("user.dir");

        return null;
    }
}
