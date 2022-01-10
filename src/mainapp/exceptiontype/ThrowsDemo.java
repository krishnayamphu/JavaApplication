package mainapp.exceptiontype;

public class ThrowsDemo {
    public void calc(int x, int y) throws ArithmeticException{
        double result=0d;
        result= x/y;
        System.out.println("Result: "+result);
    }
    public static void main(String[] args) {
        ThrowsDemo th=new ThrowsDemo();
        try{
            th.calc(4,0);
        }catch (ArithmeticException e){
            System.err.println(e);
        }

    }
}
