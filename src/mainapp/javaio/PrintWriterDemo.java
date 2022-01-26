package mainapp.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        File file=new File("student.txt");
        try {
            PrintWriter pw=new PrintWriter(file);
            pw.write("Ram,kumaripati,1234567890");
            pw.flush();
            pw.close();
            System.out.println("student data added");

            PrintWriter printWriter=new PrintWriter(System.out);
            printWriter.write("hello");
            printWriter.flush();
            printWriter.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
