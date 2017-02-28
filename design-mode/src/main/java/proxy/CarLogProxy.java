package proxy;

/**
 * Created by xyy on 2017/2/28.
 */
public class CarLogProxy implements Moveable{
    private Moveable m;

    public CarLogProxy(Moveable moveable) {
        this.m = moveable;
    }


    public void move() {
        System.out.println("汽车开始行使... 启动日志");
        m.move();
        System.out.println("汽车结束行使... 结束日志 ");
    }
}
