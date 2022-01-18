package mainapp.innerclass;

public class Outer {
    class Inner{
        void hello(){
            System.out.println("Hello, I'm from inner class");
        }
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        Inner inner=outer.new Inner();
        inner.hello();
    }
}
