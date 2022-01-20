package mainapp.datetime;

import mainapp.multithreading.ThreadNaming;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtClock;
    public DigitalClock(){
        txtClock=new JTextField(15);

        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(txtClock);
        pack();

    }
    public static void main(String[] args) {
        DigitalClock clock=new DigitalClock();
        Thread thread=new Thread(clock);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime localTime = LocalTime.now();
                txtClock.setText(dtf.format(localTime));
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
