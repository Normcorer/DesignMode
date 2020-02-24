package cn.zyj.abstractFactory;

public class XiaoMi implements Phone{
    public XiaoMi() {
        this.makePhone();
    }
    @Override
    public void makePhone() {
        System.out.println("制造了一台小米手机");
    }
}
