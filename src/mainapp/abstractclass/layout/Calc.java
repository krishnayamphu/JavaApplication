package mainapp.abstractclass.layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calc extends Frame implements WindowListener {
    private Button btn1, btn2, btnc, btnp, btneq;
    private TextField txtre;
    private Panel p;

    public Calc() {

        btn1 = new Button("1");
        btn2 = new Button("2");
        btnc = new Button("C");
        btnp = new Button("+");
        btneq = new Button("=");
        txtre = new TextField(15);

        p = new Panel();
        p.setLayout(new GridLayout(2, 3));
        p.add(btn1);
        p.add(btn2);
        p.add(btnp);
        p.add(btnc);
        p.add(btneq);

        setSize(300, 200);
        setVisible(true);
        setTitle("Calculator");
        setLayout(new BorderLayout());

        add(txtre, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);

        addWindowListener(this);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtre.setText(txtre.getText()+"1");
            }
        });

        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtre.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new Calc();
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
