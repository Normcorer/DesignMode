package cn.zyj.observe;

import cn.zyj.observe1.Oberserver01;

//�ӿڣ���WeatherData ��ʵ��
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();


}
