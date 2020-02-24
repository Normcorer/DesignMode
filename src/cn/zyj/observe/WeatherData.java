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
        //���� ���뷽��update
        notifyObservers();
     }

     //�������и���ʱ���͵���setData
    public void setData(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        //����dataChange�������µ���Ϣ���͸����뷽
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        //ע��һ���۲���
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //�Ƴ�һ���۲���
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
