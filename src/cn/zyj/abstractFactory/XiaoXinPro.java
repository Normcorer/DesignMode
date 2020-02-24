package cn.zyj.abstractFactory;

public class XiaoXinPro implements Computer{
    public XiaoXinPro(){
        this.makeComputer();
    }
    @Override
    public void makeComputer() {
        System.out.println("制造了一台小新Pro");
    }
}
