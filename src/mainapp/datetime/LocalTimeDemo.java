package mainapp.datetime;

import java.time.LocalTime;

public class LocalTimeDemo extends Thread  {
    @Override
    public void run() {
        while(true){
            LocalTime time=LocalTime.now();

            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       new LocalTimeDemo().start();
    }
}
