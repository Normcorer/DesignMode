package cn.zyj.observe1;

public class Client01 {
    public static void main(String[] args) {
        MilkStation milkStation = new MilkStation();
        guangming guangming = new guangming();
        milkStation.registerObserver(guangming);
        milkStation.setData("¹âÃ÷", 10, 10f);
    }
}
