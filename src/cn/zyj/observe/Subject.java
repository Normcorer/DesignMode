package cn.zyj.observe;

import cn.zyj.observe1.Oberserver01;

//接口，让WeatherData 来实现
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();


}
