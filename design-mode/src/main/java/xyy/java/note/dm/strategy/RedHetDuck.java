package xyy.java.note.dm.strategy;

import xyy.java.note.dm.strategy.impl.FlyWithWin;

/**
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public class RedHetDuck extends Duck {

    public RedHetDuck() {
        super();
        super.setStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是红色的");
    }
}
