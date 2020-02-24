package cn.zyj.abstractFactory;

public class AppleFatory extends AbstractFactory{
    @Override
    Phone makePhone() {
        return new IPhone();
    }

    @Override
    Computer makeComputer() {
        return new Mac();
    }
}
