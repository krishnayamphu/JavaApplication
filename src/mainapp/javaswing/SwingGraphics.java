package mainapp.javaswing;

import javax.swing.*;

public class SwingGraphics extends JFrame {
    private CanvasPanel canvasPanel;
    public SwingGraphics(){
        canvasPanel=new CanvasPanel();
        add(canvasPanel);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingGraphics();
    }
}
