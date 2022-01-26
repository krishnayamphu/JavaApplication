package mainapp.javaio;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file=new File("book.txt");
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
//            String data=br.readLine();
            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
