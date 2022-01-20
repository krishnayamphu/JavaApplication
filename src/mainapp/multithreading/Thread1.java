package mainapp.multithreading;

public class Thread1 extends Thread{
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        Thread1 tt=new Thread1();
        t.run();
        tt.run(); //we can't use run() directly if we create more than 1 thread obj.
    }
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
