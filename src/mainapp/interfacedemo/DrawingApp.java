package mainapp.interfacedemo;

public class DrawingApp {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.draw();
        rectangle.print();

        Trangle trangle=new Trangle();
        trangle.draw();
        trangle.show();
    }
}
