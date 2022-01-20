package mainapp.multithreading;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
