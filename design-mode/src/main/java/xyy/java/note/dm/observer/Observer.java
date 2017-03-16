package xyy.java.note.dm.observer;

/**
 * 这是一个观察者的接口
 * 定义更新接口，给那些目标发生改变的时候被通知的对象
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public interface Observer {

    public void update(Subject subject);
}
