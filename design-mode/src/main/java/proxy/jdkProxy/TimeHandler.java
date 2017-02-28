package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return Object 方法的返回值
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使... begin time : " + startTime);
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行使... end time : " + (endTime ));
        return null;
    }
}
