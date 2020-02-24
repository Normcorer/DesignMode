package cn.zyj.observe2;

/**
 * 主体，类似于牛奶站等
 */
public interface Subject {
    public void registObserve(Observer2 observer2);
    public void removeObserve(Observer2 observer2);
    public void notifyObserve();
}
