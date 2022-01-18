package mainapp.innerclass;
interface Vehicle{
    void run();
}
public class AnonymousInterfaceInnerClass {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle() {
            @Override
            public void run() {
                System.out.println("Vehicle is running smoothly.");
            }
        };

        vehicle.run();
    }
}
