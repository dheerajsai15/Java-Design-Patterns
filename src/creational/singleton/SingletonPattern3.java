package creational.singleton;

public class SingletonPattern3 {
    private static SingletonPattern3 instance;
    private SingletonPattern3(){}

    public static synchronized SingletonPattern3 getInstance(){
        if(instance == null)
            instance = new SingletonPattern3();
        return instance;
    }
}
