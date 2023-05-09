// Write a Program to display messages with radio buttons.

import java.awt.*;
import java.awt.event.*;

class MyMessage extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;

    public MyMessage() {
        super("Message Demo");
        l = new Label("Nothing is selected");
        cbg = new CheckboxGroup();
        c1 = new Checkbox("C", false, cbg);
        c2 = new Checkbox("Java", false, cbg);
        c3 = new Checkbox("Python", false, cbg);

        setLayout(new FlowLayout());

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if (c1.getState())
            str = c1.getLabel();
        if (c2.getState())
            str = c2.getLabel();
        if (c3.getState())
            str = c3.getLabel();
        if (str.isEmpty())
            str = "Nothing";
        l.setText(str + " is selected");
    }
}

public class MessageDemo {
    public static void main(String[] args) {
        MyMessage mm = new MyMessage();
        mm.setSize(400, 400);
        mm.setVisible(true);
    }
}
