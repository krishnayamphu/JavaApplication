package mainapp.exceptiontype;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
            int[] x=new int[2];
            x[1]=100;
            System.out.println("Value:"+x[1]);
            x[0]=200;
            System.out.println("reslult:"+x[0]);
            System.out.println("test message");

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }finally {
            System.out.println("finally block reached.");
        }
    }
}
