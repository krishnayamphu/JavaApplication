package mainapp.packagedemo;

import mainapp.interfacedemo.*;

public class PackageTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.draw();

        Trangle trangle=new Trangle();
        trangle.show();
    }
}
