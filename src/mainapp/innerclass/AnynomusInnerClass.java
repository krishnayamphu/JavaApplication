package mainapp.innerclass;
abstract class Person{
    abstract void info();
}
public class AnynomusInnerClass {
    public static void main(String[] args) {
        Person p=new Person() {
            @Override
            void info() {
                System.out.println("showing person info");
            }
        };

        p.info();
    }
}
