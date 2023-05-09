// Write a Program to print text in different colors.

import java.awt.*;
import java.awt.event.*;

class MyFontColor extends Frame {
    Label l1;
    Label l2;
    Label l3;

    public MyFontColor() {
        super("Font Color Demo");
        l1 = new Label("Red");
        l2 = new Label("Green");
        l3 = new Label("Blue");

        setLayout(null);

        l1.setBounds(20, 30, 40, 10);
        l1.setForeground(Color.red);
        l2.setBounds(20, 50, 40, 10);
        l2.setForeground(Color.green);
        l3.setBounds(20, 70, 40, 10);
        l3.setForeground(Color.blue);

        add(l1);
        add(l2);
        add(l3);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class FontColorDemo {
    public static void main(String[] args) {
        MyFontColor mfc = new MyFontColor();
        mfc.setSize(400, 400);
        mfc.setVisible(true);
    }
}
