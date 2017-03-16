package xyy.java.note.dm.template;

/**
 * 具体子类，提供咖啡的具体实现
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }
}
