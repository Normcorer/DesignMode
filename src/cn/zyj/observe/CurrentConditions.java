package cn.zyj.observe;

public class CurrentConditions implements Observer {

    //温度，气压，湿度
    private float temperatrue;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，使用的是推送的模式
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("****Today mTemperature: " + temperatrue + "******");
        System.out.println("****Today mPressure: " + pressure + "******");
        System.out.println("****Today mhumidity: " + humidity + "******");
    }
}
