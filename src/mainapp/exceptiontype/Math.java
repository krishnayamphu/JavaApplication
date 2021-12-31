package mainapp.exceptiontype;

public class Math {
    public static void main(String[] args) {
        try {
            int n = 20;
            int ans = n / 0;

            System.out.println("Output:" + ans);
        }catch (ArithmeticException e){
            System.err.println("You can't divid number by zero. "+e);
        }
    }
}
