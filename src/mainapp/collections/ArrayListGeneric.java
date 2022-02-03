package mainapp.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<String> studentList=new ArrayList<>();
        studentList.add("Ram");
        studentList.add("Hari");
        studentList.add("Sita");
        for (String name:studentList) {
            System.out.println("Student Name:"+name);
        }
    }
}
