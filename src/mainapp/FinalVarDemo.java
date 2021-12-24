package mainapp;

public class FinalVarDemo {
    final int x;
    final static int y;
    static {
        y=6;
    }
    public FinalVarDemo(){
        //x=5;
        x=5;
    }
    public static void main(String[] args) {
        FinalVarDemo ob=new FinalVarDemo();
        System.out.println(ob.x);
        System.out.println(ob.y);


    }

}
