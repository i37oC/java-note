package methodDI;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by xyy on 2017/2/24.
 */
public class A implements ApplicationContextAware{
    private ApplicationContext applicationContext;
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    /*public void testMthodDI(){
        // get a new B instance
        System.out.println(this.createB());
    }*/

    public B createB() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("b",  B.class);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
