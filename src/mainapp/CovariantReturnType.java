package mainapp;
class A1{
    public A1 get(){
        return this;
    }
}
class B1 extends A1{
    @Override
    public B1 get(){
        return this;
    }
    public void hello(){
        System.out.println("Covariant Return Type Demo");
    }
}
public class CovariantReturnType {
    public static void main(String[] args) {
        new B1().get().hello();
    }
}
