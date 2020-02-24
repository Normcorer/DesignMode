package cn.zyj.methodFactory;

public class IPhone implements Phone{
    public IPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制造了一个苹果手机");
    }
}
