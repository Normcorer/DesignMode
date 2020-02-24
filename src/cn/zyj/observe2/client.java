package cn.zyj.observe2;

public class client {
    public static void main(String[] args) {
        MilkStation milkStation = new MilkStation();
        customer customer = new customer();
        guangming guangming = new guangming();
        milkStation.registObserve(customer);
        milkStation.registObserve(guangming);
        milkStation.setMilkData("¹âÃ÷",10,10);
    }
}
