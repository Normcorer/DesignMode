package cn.zyj.abstractFactory;

public class XiaoMiFactory extends AbstractFactory{
    @Override
    Phone makePhone() {
        return new XiaoMi();
    }

    @Override
    Computer makeComputer() {
        return new XiaoXinPro();
    }
}
