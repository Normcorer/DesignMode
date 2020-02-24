package cn.zyj.methodFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory iPhonefactory = new IphoneFactory();
        Phone phone = iPhonefactory.makePhone();
        AbstractFactory xiaoMifactory1 = new XiaoMiFactory();
        Phone phone1 = xiaoMifactory1.makePhone();
    }
}
