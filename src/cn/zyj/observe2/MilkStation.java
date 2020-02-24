package cn.zyj.observe2;

import java.util.ArrayList;
import java.util.List;

public class MilkStation implements Subject{
    private String name;
    private int num;
    private int singlePrice;
    private List<Observer2> observer2s;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(int singlePrice) {
        this.singlePrice = singlePrice;
    }

    public List<Observer2> getObserver2s() {
        return observer2s;
    }

    public void setObserver2s(List<Observer2> observer2s) {
        this.observer2s = observer2s;
    }

    public MilkStation() {
        observer2s = new ArrayList<>();
    }
    @Override
    public void registObserve(Observer2 observer2) {
        observer2s.add(observer2);
    }

    @Override
    public void removeObserve(Observer2 observer2) {
        if (observer2s.contains(observer2)){
            observer2s.remove(observer2);
        }
    }

    @Override
    public void notifyObserve() {
        for (int i = 0; i < observer2s.size(); i++) {
            observer2s.get(i).update(getName(),getNum(),getSinglePrice());
        }
    }

    public void setMilkData(String name, int num, int singlePrice){
        this.name=name;
        this.num=num;
        this.singlePrice=singlePrice;
        notifyObserve();
    }
}
