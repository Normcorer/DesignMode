package cn.zyj.SimpleFactory;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if (phoneType.equalsIgnoreCase("Apple")) {
            return new IPhone();
        } else if (phoneType.equalsIgnoreCase("xiaomi")) {
            return new XiaoMi();
        }else {
            return null;
        }
    }
}
