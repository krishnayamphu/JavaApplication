package mainapp.javastring;

public class String1 {
    public static void main(String[] args) {
        String s="Hello World";
        char ch=s.charAt(6);
        String sb=s.substring(6,11);
        System.out.println(ch);
        System.out.println(s.length());
        System.out.println(sb);
        System.out.println(s.contains("Hello"));

        System.out.println(String.join("-","Welcome","to","Java"));
    }
}
