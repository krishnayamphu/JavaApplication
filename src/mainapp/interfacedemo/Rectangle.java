package mainapp.interfacedemo;

public class Rectangle implements Shape,Printable {
    @Override
    public void draw() {
        System.out.println("drawing rectangle shape");
    }

    @Override
    public void print() {
        System.out.println("printing rectangle shape");
    }
}
