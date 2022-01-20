package mainapp.multithreading;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running using runnable interface");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableThread rt=new RunnableThread();
        Thread thread=new Thread(rt);
        thread.start();
    }
}
