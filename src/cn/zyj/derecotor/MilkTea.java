package cn.zyj.derecotor;

public class MilkTea extends Drink{

    public MilkTea() {
        setDes("�̲�");
        setPrice(1.0f);
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
