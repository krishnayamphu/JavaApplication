package mainapp.multithreading;

public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=2; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Current Thread is: "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
