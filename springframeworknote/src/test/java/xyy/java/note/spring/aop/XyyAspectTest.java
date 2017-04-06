package xyy.java.note.spring.aop;


import org.junit.Test;

/**
 * @author xyy
 * @version 1.0 2017/3/19.
 * @since 1.0
 */
public class XyyAspectTest extends UnitTestBase{

    public XyyAspectTest() {
        super("classpath:spring-aop-schema.xml");
    }

    @Test
    public void test(){
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

}