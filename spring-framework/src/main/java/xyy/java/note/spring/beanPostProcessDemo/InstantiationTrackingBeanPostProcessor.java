package xyy.java.note.spring.beanPostProcessDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by xyy on 2017/2/26.
 */
public class InstantiationTrackingBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前： " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后： " + beanName);
        return bean;
    }

    public static void main(String[] args) {
        System.out.println("xxx");
    }
}
