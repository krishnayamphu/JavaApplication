package mainapp;
class A{
    int x;
}
public class FinalClassDemo extends A {
    public static void main(String[] args) {
        FinalClassDemo ob=new FinalClassDemo();
        ob.x=5;
        System.out.println(ob.x);
    }
}
