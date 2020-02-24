package cn.zyj.derecotor;

public class Client {
    public static void main(String[] args) {
        Drink milk = new Milk();
        milk = new egg(milk);
        System.out.println(milk.getDes()+"---"+milk.cost());
    }
}
