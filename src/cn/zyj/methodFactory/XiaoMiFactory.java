package cn.zyj.methodFactory;

public class XiaoMiFactory extends AbstractFactory{
    @Override
    Phone makePhone() {
        return new XiaoMi();
    }
}
