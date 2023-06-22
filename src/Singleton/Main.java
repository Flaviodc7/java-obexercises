package Singleton;

public class Main {
    public static void main(String []args){
        Singleton singleton = Singleton.getInstance();
        singleton.setCounter(15);
        System.out.println(singleton.getCounter());
    }
}
