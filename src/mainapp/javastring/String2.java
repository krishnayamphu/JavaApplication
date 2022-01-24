package mainapp.javastring;

public class String2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        String s3="Hello";
        String s4="world";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals("World"));
        System.out.println(s2.equalsIgnoreCase(s4));

        System.out.println(s1=="Hello");

        System.out.println(s1.concat(s2));

        System.out.println(s1.replace('e','a'));

        String ss="java string split method by aptech";
        String[] words=ss.split("\\s");//splits the string based on whitespace
    //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }

        System.out.println(s1.indexOf('o'));

        String text="             Java             ";
        System.out.println(text.trim());


    }
}
