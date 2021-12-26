package mainapp.interfacedemo;

public class Trangle implements Showable {
    @Override
    public void show() {
        System.out.println("showing trangle shape");
    }

    @Override
    public void draw() {
        System.out.println("drawing trangle shape");
    }
}
