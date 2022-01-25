package mainapp.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("doc.txt");
            writer.write("Welcome to java io");
            writer.append(". hello world.");
            writer.flush();
            writer.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
