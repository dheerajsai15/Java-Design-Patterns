package creational.singleton;

public class SingletonPattern5 {

    private SingletonPattern5(){}

    private static class Holder{
        private static final SingletonPattern5 instance = new SingletonPattern5();
    }

    public static SingletonPattern5 getInstance(){
        return Holder.instance;
    }
}
