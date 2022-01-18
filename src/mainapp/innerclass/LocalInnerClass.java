package mainapp.innerclass;

public class LocalInnerClass {
    void display(){
        class Student{
            void showStudentInfo(){
                System.out.println("showing student info.");
            }
        }
        Student student=new Student();
        student.showStudentInfo();
    }

    public static void main(String[] args) {
        LocalInnerClass local=new LocalInnerClass();
        local.display();
    }
}
