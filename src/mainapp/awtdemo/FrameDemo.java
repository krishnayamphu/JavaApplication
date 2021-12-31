package mainapp.awtdemo;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        FlowLayout layout=new FlowLayout();

        Label lbltext=new Label("Hello World");
        TextField textField=new TextField(20);
        Button btn1 =new Button("Click");

        f.setVisible(true);
        f.setSize(400,300);
        f.setTitle("My Window");
        f.setResizable(true);
        f.setLayout(layout);

        f.add(lbltext);
        f.add(textField);
        f.add(btn1);

    }
}
