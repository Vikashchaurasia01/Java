// Draw the Diagram

import java.awt.*;
import java.awt.event.*;

class MyDrawing extends Frame {
    public MyDrawing() {
        super("House Demo");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        repaint();
    }

    public void paint(Graphics g) {
        int[] x = { 100, 250, 300, 50 };
        int[] y = { 50, 50, 150, 150 };

        g.setColor(Color.ORANGE);
        g.fillPolygon(x, y, x.length);
        g.setColor(Color.BLACK);
        g.drawPolygon(x, y, x.length);

        g.setColor(Color.YELLOW);
        g.fillRect(50, 150, 250, 100);
        g.setColor(Color.BLACK);
        g.drawRect(50, 150, 250, 100);

        g.setColor(Color.CYAN);
        g.fillOval(90, 180, 40, 40);
        g.setColor(Color.BLACK);
        g.drawOval(90, 180, 40, 40);

        g.setColor(Color.CYAN);
        g.fillOval(220, 180, 40, 40);
        g.setColor(Color.BLACK);
        g.drawOval(220, 180, 40, 40);

        g.setColor(Color.GREEN);
        g.fillRect(155, 170, 40, 80);
        g.setColor(Color.BLACK);
        g.drawRect(155, 170, 40, 80);

        g.setColor(Color.BLUE);
        g.fillOval(50, 270, 250, 30);
        g.setColor(Color.BLACK);
        g.drawOval(50, 270, 250, 30);
    }
}

public class HouseDemo {
    public static void main(String[] args) {
        MyDrawing md = new MyDrawing();
        md.setSize(400, 400);
        md.setVisible(true);
    }
}