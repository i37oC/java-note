package beanPostProcessDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xyy on 2017/2/26.
 */
public class Boot {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-beanpostprocessor.xml"});

    }
}
