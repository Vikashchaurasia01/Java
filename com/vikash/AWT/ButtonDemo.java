// Write a Program to create a frame with three Buttons

import java.awt.*;
import java.awt.event.*;

class MyButton extends Frame {
    Button b1, b2, b3;

    public MyButton() {
        super("Button Demo");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        MyButton mb = new MyButton();
        mb.setSize(300, 300);
        mb.setVisible(true);
    }
}
