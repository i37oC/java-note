import custom.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xyy on 2017/2/22.
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
        Student student = context.getBean("hello", Student.class);
        student.setAge(10);
        student.setName("xxx");
        System.out.println(student);
    }
}
