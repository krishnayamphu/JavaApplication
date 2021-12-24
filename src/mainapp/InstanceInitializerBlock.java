package mainapp;

public class InstanceInitializerBlock {
    int x;
    public InstanceInitializerBlock(){
        System.out.println(x);
    }
    {
        x=5;
    }
    public static void main(String[] args) {
    InstanceInitializerBlock ob1=new InstanceInitializerBlock();
    new InstanceInitializerBlock();
    new InstanceInitializerBlock();
    }
}
