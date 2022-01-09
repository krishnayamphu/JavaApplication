package mainapp.awtdemo.awtgraphics;

import java.awt.*;

public class GraphicsDemo extends Frame {
    GraphicsDemo(){
    setVisible(true);
    setSize(400,500);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }

    @Override
    public void paint(Graphics g) {
        Color c=new Color(25,25,200);
        int x[]={50,300,100,150,250};
        int y[]={100,100,250,50,250};

        g.drawRect(50,50,100,100);

        g.setColor(Color.GREEN);
        g.fillOval(50,200,200,100);

        g.setColor(Color.RED);
        g.drawPolygon(x,y,5);

        g.fillArc(100,300,100,100,0,60);
        g.drawArc(20,350,100,100,90,180);
    }
}
