package cn.zyj.observe;

public class Client {
    public static void main(String[] args) {
        //����һ��WeatherData
        WeatherData weatherData = new WeatherData();
        //�����۲���
        CurrentConditions currentConditions = new CurrentConditions();
        //ע��۲���
        weatherData.registerObserver(currentConditions);
        weatherData.removeObserver(currentConditions);
        //Test
        System.out.println("֪ͨ����ע��Ĺ۲��ߣ�������Ϣ");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
