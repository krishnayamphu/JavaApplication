package mainapp.awtdemo.eventdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventDemo extends Frame {
    private Button btn1,btn2,btnc;
    private TextField txtbox;

    public EventDemo(){
        btn1=new Button(" 1 ");
        btn2=new Button(" 2 ");
        btnc=new Button("Clear");
        txtbox=new TextField(15);

        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());

        add(txtbox);
        add(btn1);
        add(btn2);
        add(btnc);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              txtbox.setText("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("2");
            }
        });
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("");
            }
        });
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered.");
                txtbox.setText("Mouse Entered.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exit.");
                txtbox.setText("Mouse Exit.");
            }
        });
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
