package cn.zyj.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone apple = phoneFactory.makePhone("apple");
        phoneFactory.makePhone("xiaomi");
    }

}
