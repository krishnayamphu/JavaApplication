package mainapp.datetime;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtClock;
    public DigitalClock(){
        txtClock=new JTextField(6);
        txtClock.setFont(new Font("Arial",Font.BOLD,28));
        txtClock.setHorizontalAlignment(JTextField.CENTER);
        txtClock.setEditable(false);
        add(txtClock);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
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
