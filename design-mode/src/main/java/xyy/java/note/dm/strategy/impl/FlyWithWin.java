package xyy.java.note.dm.strategy.impl;

import xyy.java.note.dm.strategy.FlyingStrategy;

/**
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public class FlyWithWin implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("使用翅膀飞行");
    }
}
