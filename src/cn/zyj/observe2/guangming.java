package cn.zyj.observe2;

public class guangming implements Observer2{
    private String name;
    private int num;
    private int singlePrice;

    @Override
    public void update(String name, int num, int singlePrice) {
        this.name=name;
        this.num=num;
        this.singlePrice=singlePrice;
        display();
    }
    public void display(){
        System.out.println("---------------¹âÃ÷ÄÌÒµ---------------");
        System.out.println("--------"+name+"------------");
        System.out.println("--------"+num+"------------");
        System.out.println("--------"+singlePrice+"------------");
    }
}
