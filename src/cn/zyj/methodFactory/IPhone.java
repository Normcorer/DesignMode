package cn.zyj.methodFactory;

public class IPhone implements Phone{
    public IPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("������һ��ƻ���ֻ�");
    }
}
