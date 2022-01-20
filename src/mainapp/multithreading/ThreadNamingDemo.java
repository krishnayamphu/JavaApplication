package mainapp.multithreading;

public class ThreadNamingDemo extends Thread {
    public ThreadNamingDemo(String threadName){
        super(threadName);
    }
    public static void main(String[] args) {
        ThreadNamingDemo t=new ThreadNamingDemo("CustomThread 1");
        t.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" is running");
    }
}
