package mainapp.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List persons=new ArrayList();
        persons.add("Ram");
        persons.add("Sita");

        Iterator iterator=persons.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============");
        persons.remove("Ram");

        Iterator itr=persons.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("===============");
        persons.add("Hari");
        persons.add(100);
        for (Object ob:persons) {
            System.out.println(ob.toString());
        }
    }
}
