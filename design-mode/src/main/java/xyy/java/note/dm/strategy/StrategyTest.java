package xyy.java.note.dm.strategy;

/**
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public class StrategyTest {
    public static void main(String[] args) {
        Duck duck = new RedHetDuck();
        duck.display();
        duck.quick();
        duck.fly();
    }
}
