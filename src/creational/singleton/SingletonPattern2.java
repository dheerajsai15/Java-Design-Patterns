package creational.singleton;

public class SingletonPattern2 {
    private static SingletonPattern2 instance;
    private SingletonPattern2(){}

    public static SingletonPattern2 getInstance(){
        if(instance == null)
            instance = new SingletonPattern2();
        return instance;
    }
}
