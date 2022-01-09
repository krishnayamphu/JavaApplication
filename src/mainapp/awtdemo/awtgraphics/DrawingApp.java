package mainapp.awtdemo.awtgraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawingApp extends Frame implements WindowListener {
    Button btn1;
    Panel pnlTop,pnlCenter;
    MyCanvas canvas=new MyCanvas();
    public DrawingApp(){

        btn1=new Button("Draw Picture");

        pnlTop=new Panel();
        pnlTop.setLayout(new FlowLayout());
        pnlTop.add(btn1);

        pnlCenter=new Panel();
        pnlCenter.add(canvas);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPicture();
            }
        });
        addWindowListener(this);



        setVisible(true);
        setSize(600,600);
        setLayout(new BorderLayout());

        add(pnlTop,BorderLayout.NORTH);
        add(pnlCenter,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new DrawingApp();
    }

    public void drawPicture(){
        canvas.setVisible(true);
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
