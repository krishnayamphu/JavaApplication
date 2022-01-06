package mainapp.abstractclass.layout;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutDemo extends Frame implements WindowListener {
    Button btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutDemo(){
        btn1=new Button("NORTH");
        btn2=new Button("SOUTH");
        btn3=new Button("EAST");
        btn4=new Button("WEST");
        btn5=new Button("CENTER");

        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());
        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);

        addWindowListener(this);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
