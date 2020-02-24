package cn.zyj.derecotor;

public class Decorate extends Drink{
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        return super.getDes()+"&&"+drink.getDes();
    }

    @Override
    public float cost() {
        return getPrice()+drink.cost();
    }
}
