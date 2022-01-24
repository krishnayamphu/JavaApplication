package mainapp.javaswing;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private int[] x={0,200,300,500,600,700,800};
    private int[] y={100,50, 80,5,60,20,100};

    private int[] x1={600,610,700,690};
    private int[] y1={90,70, 70,90};
    private int[] x2={710,690,700,720};
    private int[] y2={90,70, 70,90};
    private int[] x3={685,690,690,710,710,685};
    private int[] y3={90,70, 70,90,120,130};

    public CanvasPanel(){
        this.setPreferredSize(new Dimension(800,500));
    }
    @Override
    public void paint(Graphics g) {
        Color treeColor=new Color(0,200,0,255);
        Color treeColor1=new Color(170,110,88,225);
        //sun
        g.setColor(Color.orange);
        g.fillArc(260,50,50,50,0,360);

        //cloud
        g.setColor(new Color(205,205,205,255));
        g.fillOval(60,10,30,30);
        g.fillOval(40,20,40,20);
        g.fillOval(65,20,40,20);

        //mountain
        g.setColor(new Color(50,0,200,255));
        g.fillPolygon(x,y,7);

        //ground
        g.setColor(new Color(0,0,0,150));
        g.fillRect(0,100,800,60);

        //house
        g.setColor(new Color(255,150,150,255));
        g.fillPolygon(x3,y3,6);
        g.setColor(new Color(80,57,56,255));
        g.fillPolygon(x2,y2,4);
        g.setColor(new Color(121,85,72,255));
        g.fillPolygon(x1,y1,4);

        g.setColor(new Color(255,154,180,255));
        g.fillRect(605,90,80,40);

        g.setColor(new Color(255,120,120,255));
        g.fillRect(650,100,20,30);



        //tree 1
        g.setColor(treeColor1);
        g.fillRect(502,90,5,30);
        g.setColor(treeColor);
        g.fillOval(500,50,10,10);
        g.fillOval(490,55,20,20);
        g.fillOval(500,55,20,20);
        g.fillOval(485,67,40,30);

        //tree 2
        g.setColor(treeColor1);
        g.fillRect(550,90,5,30);
        g.setColor(new Color(0,200,0,255));
        g.fillOval(545,60,10,10);
        g.fillOval(540,65,20,15);
        g.fillOval(545,65,20,15);
        g.fillOval(535,75,35,20);

        //tree 3
        g.setColor(treeColor1);
        g.fillRect(780,90,5,30);
        g.setColor(treeColor);
        g.fillOval(780,60,10,10);
        g.fillOval(770,65,20,15);
        g.fillOval(780,65,20,15);
        g.fillOval(760,75,50,20);

        //road
        g.setColor(new Color(40,40,40,255));
        g.fillRect(0,160,800,60);

        g.setColor(Color.white);
        g.fillRect(100,185,50,5);
        g.fillRect(300,185,50,5);
        g.fillRect(500,185,50,5);
        g.fillRect(700,185,50,5);







    }
}
