package xyy.java.note.dm.strategy;

/**
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public abstract class Duck {
    private FlyingStrategy strategy;

    public void quick(){
        System.out.println("嘎嘎嘎...");
    }

    public void setStrategy(FlyingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 显示鸭子外观
     */
    public abstract void display();

    public void fly(){
        strategy.performFly();
    }

}
