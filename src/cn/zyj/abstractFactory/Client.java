package cn.zyj.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFatory();
        AbstractFactory xiaomiFactory = new XiaoMiFactory();
        appleFactory.makePhone();
        appleFactory.makeComputer();
        xiaomiFactory.makePhone();
        xiaomiFactory.makeComputer();
    }
}
