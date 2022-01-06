package mainapp.abstractclass.layout;

import java.awt.*;

public class GridLayouDemo extends Frame {
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    public GridLayouDemo(){
        btn1=new Button("1");
        btn2=new Button("2");
        btn3=new Button("3");
        btn4=new Button("4");
        btn5=new Button("5");
        btn6=new Button("6");

        setVisible(true);
        setSize(400,400);
        setLayout(new GridLayout(3,2));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
    }

    public static void main(String[] args) {
        new GridLayouDemo();
    }
}
