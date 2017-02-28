package proxy;

/**
 * Created by xyy on 2017/2/28.
 *
 * 聚合方式
 *
 */
public class Car3 implements Moveable {
    private Car car;

    public Car3(Car car) {
        this.car = car;
    }

    public void move() {
        car.move();
    }
}
