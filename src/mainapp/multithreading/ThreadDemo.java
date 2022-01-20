package mainapp.multithreading;

public class ThreadDemo extends Thread {
    public ThreadDemo(){

    }
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.start();
    }
}
