package cn.zyj.abstractFactory;

public class XiaoXinPro implements Computer{
    public XiaoXinPro(){
        this.makeComputer();
    }
    @Override
    public void makeComputer() {
        System.out.println("������һ̨С��Pro");
    }
}
