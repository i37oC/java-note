package xyy.java.note.dm.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 *
 * 提神饮料
 * @author xyy
 * @version 1.0 2017/3/9.
 * @since 1.0
 */
public abstract class RefreshBeverage {

    /**
     * 见名知意： template 表明该方法是一个模板方法
     */
    public final void prepareBeverageTemplate(){
        //1 将水煮沸
        boilwater();
        //2、泡制饮料
        brew();
        //3、将饮料倒入杯中
        pourIncup();
        //4、加入配料

        if(isCustomerWantsCondiments()){
            addCondiments();
        }

    }

    /**
     * HOOK 钩子函数，提供一个默认或空的实现
     * 具体子类可以自行决定是否挂钩以及如何挂钩
     * 询问用户是否加料
     * @return
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourIncup() {
        System.out.println("将水倒入杯中...");
    }


    private void boilwater() {
        System.out.println("boilwater ... ");
    }
}
