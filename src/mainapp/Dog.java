package mainapp;
class Animal{
    public void eat(){
        System.out.println("Animal eat something...");
    }
}
public class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat meat.");
    }

    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
    }
}
