package cn.zyj.observe2;

/**
 * ���壬������ţ��վ��
 */
public interface Subject {
    public void registObserve(Observer2 observer2);
    public void removeObserve(Observer2 observer2);
    public void notifyObserve();
}
