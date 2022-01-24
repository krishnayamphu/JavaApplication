package mainapp.javastring;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb);
        sb.append(" World");

        System.out.println(sb);

        sb.insert(6,"Java ");
        System.out.println(sb);

        sb.replace(6,10,"beautiful");
        System.out.println(sb);

        sb.delete(0,6);
        System.out.println(sb);

        sb.deleteCharAt(14);
        System.out.println(sb);
    }
}
