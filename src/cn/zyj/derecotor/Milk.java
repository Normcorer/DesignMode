package cn.zyj.derecotor;

public class Milk extends Drink{

    public Milk() {
        setDes("ţ��");
        setPrice(3.0f);
    }
    @Override
    public float cost() {
        return super.getPrice();
    }
}
