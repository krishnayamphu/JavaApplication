package mainapp.awtdemo.awtgraphics;

import java.awt.*;

public class MyCanvas extends Canvas {
    public MyCanvas(){
        setBackground (Color.GRAY);
        setSize(600,300);
        setVisible(false);
    }
    public void paint(Graphics g)
    {

        // adding specifications
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}
