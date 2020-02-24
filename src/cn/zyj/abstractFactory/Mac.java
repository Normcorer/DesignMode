package cn.zyj.abstractFactory;

public class Mac implements Computer{
    public Mac() {
        this.makeComputer();
    }
    @Override
    public void makeComputer() {
        System.out.println("制造了一台MacPro");
    }
}
