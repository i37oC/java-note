package xyy.java.note.spring.methodDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xyy on 2017/2/24.
 */
public class MethodDIDemo {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"spring-methodDI.xml"});
        A a = context.getBean("a", A.class);
        System.out.println(a.createB().hashCode());
        System.out.println(a.createB().hashCode());
        System.out.println(a.createB().hashCode());

        Amdi amdi = context.getBean("amdi", Amdi.class);
        System.out.println(amdi.createB().hashCode());
        System.out.println(amdi.createB().hashCode());
        System.out.println(amdi.createB().hashCode());
    }
}
