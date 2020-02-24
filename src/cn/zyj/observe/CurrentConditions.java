package cn.zyj.observe;

public class CurrentConditions implements Observer {

    //�¶ȣ���ѹ��ʪ��
    private float temperatrue;
    private float pressure;
    private float humidity;

    //�����������������WeatherData�����ã�ʹ�õ������͵�ģʽ
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //��ʾ
    public void display() {
        System.out.println("****Today mTemperature: " + temperatrue + "******");
        System.out.println("****Today mPressure: " + pressure + "******");
        System.out.println("****Today mhumidity: " + humidity + "******");
    }
}
