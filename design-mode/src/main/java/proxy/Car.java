package proxy;

import java.util.Random;

/**
 * Created by xyy on 2017/2/28.
 */
public class Car implements Moveable {
    public void move() {


        // 实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行使中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
    }
}
