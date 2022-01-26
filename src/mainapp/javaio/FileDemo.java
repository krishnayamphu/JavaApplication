package mainapp.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("mydocument.txt");
        try {
            file.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
