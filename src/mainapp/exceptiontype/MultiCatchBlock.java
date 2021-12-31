package mainapp.exceptiontype;

import javax.swing.*;

public class MultiCatchBlock {
    public static void main(String[] args) {
       try {
           int n = 50;
           int num[] = new int[5];
           int ans = n / 5;
           System.out.println("Output:"+ans);
           num[10] = 20;
           System.out.println("num:"+num[10]);
       }
       catch (ArithmeticException e){
           System.err.println(e);
       }catch (ArrayIndexOutOfBoundsException e){
           System.err.println(e);
           JOptionPane.showMessageDialog(null,e,"error",JOptionPane.ERROR_MESSAGE);
       }

    }
}
