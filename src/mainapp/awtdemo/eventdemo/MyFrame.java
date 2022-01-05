package mainapp.awtdemo.eventdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {
    Button btn,btnclose;

    public MyFrame() {
        btn = new Button("Click");
        btnclose=new Button("Exit");

        setVisible(true);
        setSize(400, 300);
        setLayout(new FlowLayout());
        add(btn);
        btn.addActionListener(this);

        add(btnclose);
        btnclose.addActionListener(this);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("Hello World !");
        }
        if(e.getSource()==btnclose){
            System.exit(0);
        }
    }
}
