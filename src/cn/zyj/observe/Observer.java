package cn.zyj.observe;

//观察者接口，由观察者来实现
public interface Observer {

    public void update(float temperatrue, float pressure, float humidity);
}
