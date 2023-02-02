package oop.abstraction.abstraction1;

public class Alia extends OnlineStudent{

    public Alia(String name, int id){
        super("OnlineName", 1111);
    }

    @Override
    public void study() {
        System.out.println("Alia studies");
    }

    @Override
    public int test1() {
        return 8;
    }

    @Override
    public int watchViaZoom() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Alia sleeps");
    }
}
