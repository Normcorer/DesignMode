package cn.zyj.methodFactory;

public class IphoneFactory extends AbstractFactory{
    @Override
    Phone makePhone() {
        return new IPhone();
    }
}
