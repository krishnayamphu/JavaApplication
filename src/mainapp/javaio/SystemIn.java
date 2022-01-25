package mainapp.javaio;

import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) {
        try {
            int data=System.in.read();
            System.out.println((char)data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
