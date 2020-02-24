package cn.zyj.observe1;

public class guangming implements Oberserver01{

    private String banner;
    private int num;
    private float price;

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void update(String banner, int num, float price) {
        this.banner = banner;
        this.num =num;
        this.price = price * num;
        display();
    }

    public void display(){
        System.out.println("品牌："+ getBanner()+"---订购了"+getNum()+"瓶牛奶总共花费"+getPrice()+"元");
    }
}
