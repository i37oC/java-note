package xyy.java.note.dm.observer;

/**
 * 具体的目标对象，负责吧有关状态存入到具体的观察者对象中
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConcreteSubject extends Subject {
    //目标状态
    private String sujectState;

    public String getSujectState() {
        return sujectState;
    }

    public void setSujectState(String sujectState) {
        this.sujectState = sujectState;
        this.notifyObservers();
    }
}
