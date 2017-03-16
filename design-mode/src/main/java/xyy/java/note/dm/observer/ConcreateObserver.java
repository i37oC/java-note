package xyy.java.note.dm.observer;

/**
 * 具体观察者对象，实现更新的方法，使自身状态和目标状态保持一致
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConcreateObserver implements Observer {
    //观察者状态
    private String observerState;


    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        observerState = concreteSubject.getSujectState();
    }
}
