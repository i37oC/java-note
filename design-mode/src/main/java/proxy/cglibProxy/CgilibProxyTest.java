package proxy.cglibProxy;

/**
 * Created by xyy on 2017/2/28.
 */
public class CgilibProxyTest {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();
        System.out.println("\n\n");
        train.add();
    }
}
