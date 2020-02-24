package cn.zyj.observe;

public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        //注册观察者
        weatherData.registerObserver(currentConditions);
        weatherData.removeObserver(currentConditions);
        //Test
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
