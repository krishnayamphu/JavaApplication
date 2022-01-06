package mainapp.awtdemo.eventdemo;

import java.awt.*;
import java.awt.event.*;

public class WindowDemo extends Frame implements WindowListener, KeyListener {
    TextField textField;
    public WindowDemo(){
        textField=new TextField(15);

        setVisible(true);
        setSize(500,400);
        setLayout(new FlowLayout());


        addWindowListener(this);
        textField.addKeyListener(this);
        add(textField);
    }

    public static void main(String[] args) {
        new WindowDemo();
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
        System.out.println("activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("deactivated");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("KEY: "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
