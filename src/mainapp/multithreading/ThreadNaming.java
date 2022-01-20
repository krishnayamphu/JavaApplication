package mainapp.multithreading;

public class ThreadNaming  extends Thread{
    public static void main(String[]args){
        ThreadNaming t1=new ThreadNaming();

        System.out.println(t1.getName());
        t1.start();
        t1.setName("MyThread 1");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running...");
    }
}
