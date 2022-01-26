package mainapp.javaio;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        File file=new File("demo");
        file.mkdir();
        System.out.println("directory created");
    }
}
