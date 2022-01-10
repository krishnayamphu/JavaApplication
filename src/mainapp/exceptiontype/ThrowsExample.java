package mainapp.exceptiontype;

public class ThrowsExample {
    public static void main (String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException {
        int x=5,y=1;
        double result=0d;
        result=x/y;
        System.out.println("Reslult: "+result);

        int []num=new int[2];
        num[10]=10;
        System.out.println("Number: "+num[10]);
    }
}
