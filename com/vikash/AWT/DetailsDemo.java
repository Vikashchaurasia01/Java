// Create the following Details.

import java.awt.*;
import java.awt.event.*;

class MyDetails extends Frame {
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    Button b1, b2;

    public MyDetails() {
        super("Details Demo");
        l1 = new Label("First name");
        l2 = new Label("Last name");
        l3 = new Label("Date Of Birth");

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);

        b1 = new Button("Submit");
        b2 = new Button("Reset");

        setLayout(null);
        l1.setBounds(20, 60, 70, 25);
        l2.setBounds(20, 110, 70, 25);
        l3.setBounds(20, 160, 70, 25);

        tf1.setBounds(140, 60, 120, 25);
        tf2.setBounds(140, 110, 120, 25);
        tf3.setBounds(140, 160, 120, 25);

        b1.setBounds(20, 220, 120, 25);
        b2.setBounds(140, 220, 120, 25);

        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });
    }
}

public class DetailsDemo {
    public static void main(String[] args) {
        MyDetails md = new MyDetails();
        md.setSize(400, 400);
        md.setVisible(true);
    }
}
