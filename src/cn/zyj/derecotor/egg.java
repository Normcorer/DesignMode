package cn.zyj.derecotor;

public class egg extends Decorate{
    public egg(Drink drink) {
        super(drink);
        setDes("����");
        setPrice(2.0f);
    }
}
