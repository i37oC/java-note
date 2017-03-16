package xyy.java.note.dm.observer.webObserverPattern;

/**
 * 具体的目标对象，负责吧有关状态存入到具体的观察者对象中
 *
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    //目标状态
    private String weatherContent;

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getWeatherContent() {
        return weatherContent;
    }
}
