package mainapp.awtdemo;

import java.awt.*;

public class PanelDemo extends Frame {
    public static void main(String[] args) {

        Button btn1=new Button("Button 1");
        Button btn2=new Button("Button 2");

        Panel p1=new Panel();
        Panel p2=new Panel();

        p1.add(btn1);
        p1.setBackground(Color.RED);

        p2.add(btn2);
        p2.setBackground(Color.BLUE);

        BorderLayout bl=new BorderLayout();
        PanelDemo frame=new PanelDemo();
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setTitle("Panel Demo");
        frame.setLayout(bl);

        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.CENTER);

    }
}
