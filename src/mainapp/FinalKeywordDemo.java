package mainapp;

public class FinalKeywordDemo extends Math {
    final double PI=3.14;

//    public final void sum(){
//        System.out.println("final method demo");
//    }

    public static void main(String[] args) {
        FinalKeywordDemo ob=new FinalKeywordDemo();
        //ob.PI=3.1431;
        System.out.println(ob.PI);

        ob.sum();
    }
}
