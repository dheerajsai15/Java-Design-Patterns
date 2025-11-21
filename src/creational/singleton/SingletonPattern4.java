package creational.singleton;

public class SingletonPattern4 {
    private static volatile SingletonPattern4 instance;
    private SingletonPattern4(){}

    public static SingletonPattern4 getInstance(){
        if(instance == null){
            synchronized (SingletonPattern4.class){
                if(instance == null){
                    instance = new SingletonPattern4();
                }
            }
        }
        return instance;
    }
}
