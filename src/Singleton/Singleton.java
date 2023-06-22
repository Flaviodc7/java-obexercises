package Singleton;

public class Singleton {
    private static Singleton singleton;
    int counter;

    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
    public int getCounter(){
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }
}