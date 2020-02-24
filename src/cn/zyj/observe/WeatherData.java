package cn.zyj.observe;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public void setTemperatrue(float temperatrue) {
        this.temperatrue = temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
     public void dataChange() {
        //调用 接入方的update
        notifyObservers();
     }

     //当数据有更新时，就调用setData
    public void setData(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息推送给接入方
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        //注册一个观察者
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //移除一个观察者
        if (observers.contains(o))
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure,this.humidity);
        }
    }
}
