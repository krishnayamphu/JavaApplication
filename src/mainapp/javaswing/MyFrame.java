package mainapp.javaswing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton btn;
    public MyFrame(){
        btn=new JButton("Ok");

        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());
        add(btn);

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
