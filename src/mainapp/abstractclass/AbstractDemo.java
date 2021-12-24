package mainapp.abstractclass;
abstract class A{
    int x;

    public void test(){
        System.out.println("test is non-abstract method.");
    }

    abstract void msg();
}
public class AbstractDemo extends A {

    public static void main(String[] args) {
        AbstractDemo ab=new AbstractDemo();
        ab.x=5;
        System.out.println(ab.x);

        ab.test();
        ab.msg();
    }

    @Override
    void msg() {
        System.out.println("abstract method implemented in abstractdemo class");
    }
}
