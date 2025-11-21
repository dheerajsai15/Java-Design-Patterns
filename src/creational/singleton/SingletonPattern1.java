package creational.singleton;

public class SingletonPattern1 {
    private static final SingletonPattern1 instance = new SingletonPattern1();
    private SingletonPattern1(){
    }

    public static SingletonPattern1 getInstance(){
        return instance;
    }
}
