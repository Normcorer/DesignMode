package cn.zyj.SimpleFactory;

public class IPhone implements Phone{
    public IPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("������һ̨ƻ���ֻ�");
    }
}