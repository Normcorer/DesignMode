package cn.zyj.derecotor;

public class MilkTea extends Drink{

    public MilkTea() {
        setDes("дл╡Х");
        setPrice(1.0f);
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
