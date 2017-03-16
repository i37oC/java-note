package xyy.java.note.dm.proxy;

/**
 * Created by xyy on 2017/2/28.
 */
public class CarTimeProxy implements Moveable{
    private Moveable m;

    public CarTimeProxy(Moveable moveable) {
        this.m = moveable;
    }


    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使... begin time : " + startTime);
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行使... end time : " + (endTime ));
    }
}
