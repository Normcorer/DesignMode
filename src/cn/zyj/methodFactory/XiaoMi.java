package cn.zyj.methodFactory;

public class XiaoMi implements Phone{
    public XiaoMi(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("������һ̨С���ֻ�");
    }
}
