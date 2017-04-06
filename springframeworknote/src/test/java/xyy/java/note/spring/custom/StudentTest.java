package xyy.java.note.spring.custom;


import org.junit.Test;
import xyy.java.note.spring.aop.UnitTestBase;

/**
 * @author xyy
 * @version 1.0 2017/3/17.
 * @since 1.0
 */
public class StudentTest extends UnitTestBase {

    public StudentTest() {
        super("classpath:spring-beanpostprocessor.xml");
    }

    @Test
    public void te(){
        Student student = super.getBean(Student.class);
        student.setName("hehe");
        student.setAge(1);
        System.out.println(student);
    }
}