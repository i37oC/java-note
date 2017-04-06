package xyy.java.note.spring.aop;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author xyy
 * @version 1.0 2017/3/17.
 * @since 1.0
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        if (StringUtils.isEmpty(springXmlPath)){
            springXmlPath = "classpath*:spring-*.xml";
        }

        context = new ClassPathXmlApplicationContext(springXmlPath);
        context.start();

    }

    @After
    public void after(){
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId){
        return (T)context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }
}
