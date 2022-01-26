package mainapp.javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file=new File("book.txt");
        try {
            BufferedWriter bf=new BufferedWriter(new FileWriter(file));
            bf.write("java io demo");
            bf.flush();
            bf.close();
            System.out.println("text write successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
