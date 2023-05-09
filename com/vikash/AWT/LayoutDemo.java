// Using AWT create Border, Grid Flow, and Box layout.
 

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

class MyLayout extends Frame {
    Button b1, b2, b3, b4, b5;

    public MyLayout() {
        b1 = new Button("Border Layout");
        b2 = new Button("Border Layout");
        b3 = new Button("Border Layout");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.SOUTH);

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3, 2));
        p1.add(new Button("Grid Layout"));
        p1.add(new Button("Grid Layout"));
        p1.add(new Button("Grid Layout"));
        p1.add(new Button("Grid Layout"));
        p1.add(new Button("Grid Layout"));
        p1.add(new Button("Grid Layout"));
        add(p1, BorderLayout.CENTER);

        Panel p2 = new Panel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.add(new Button("Box Layout"));
        p2.add(new Button("Box Layout"));
        p2.add(new Button("Box Layout"));
        p2.add(new Button("Box Layout"));
        add(p2, BorderLayout.EAST);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class LayoutDemo {
    public static void main(String[] args) {
        MyLayout ml = new MyLayout();
        ml.setSize(400, 400);
        ml.setVisible(true);
    }
}
