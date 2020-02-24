package cn.zyj.observe1;

public interface Subject01 {
    public void registerObserver(Oberserver01 o);
    public void removeObserver(Oberserver01 o);
    public void notifyObservers();
}
