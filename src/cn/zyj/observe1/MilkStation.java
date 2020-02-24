package cn.zyj.observe1;

import java.util.ArrayList;
import java.util.List;

public class MilkStation implements Subject01 {
    private List<Oberserver01> oberserver01;
    private String banner;
    private int num;
    private float price;

    public MilkStation(){
        oberserver01 = new ArrayList<>();
    }

    @Override
    public void registerObserver(Oberserver01 o) {
        oberserver01.add(o);
    }

    @Override
    public void removeObserver(Oberserver01 o) {
        if (oberserver01.contains(o)){
            oberserver01.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < oberserver01.size(); i++) {
            oberserver01.get(i).update(getBanner(), getNum(), getPrice());
        }
    }

    public void setData(String banner, int num, float price){
        this.banner = banner;
        this.num = num;
        this.price = price;
        notifyObservers();
    }
    public List<Oberserver01> getOberserver01() {
        return oberserver01;
    }

    public void setOberserver01(List<Oberserver01> oberserver01) {
        this.oberserver01 = oberserver01;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
