package cn.zyj.abstractFactory;

public class IPhone implements Phone{
    public IPhone(){
        this.makePhone();
    }
    @Override
    public void makePhone() {
        System.out.println("������һ̨IPhone");
    }
}
