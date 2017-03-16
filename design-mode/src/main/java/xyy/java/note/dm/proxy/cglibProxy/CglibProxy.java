package xyy.java.note.dm.proxy.cglibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xyy on 2017/2/28.
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * @param o 目标类的实例
     * @param method 目标方法的反射对象
     * @param objects 方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin...");
        methodProxy.invokeSuper(o, objects);
        System.out.println("end...");
        return null;
    }
}
