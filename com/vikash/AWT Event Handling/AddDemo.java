// Implement the following addition operation

import java.awt.*;
import java.awt.event.*;

class MyAdd extends Frame {
    TextField tf1, tf2;
    Label l;
    Button b;

    public MyAdd() {
        super("Addition Demo");
        tf1 = new TextField(60);
        tf2 = new TextField(60);
        l = new Label("");
        b = new Button("Add");

        setLayout(null);
        tf1.setBounds(110, 40, 80, 20);
        tf2.setBounds(110, 80, 80, 20);
        b.setBounds(130, 150, 40, 30);
        l.setBounds(100, 120, 120, 20);
        add(tf1);
        add(tf2);
        add(b);
        add(l);
        b.addActionListener(new MyHandler());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class MyHandler implements ActionListener {

        // @Override
        public void actionPerformed(ActionEvent e) {
            int num1;
            int num2;
            String str;
            if (e.getSource() == b) {
                num1 = Integer.parseInt(tf1.getText());
                num2 = Integer.parseInt(tf2.getText());
                str = "Their sum is = " + Integer.toString(num1 + num2);
                l.setText(str);
            }
        }
    }

}

public class AddDemo {
    public static void main(String[] args) {
        MyAdd ma = new MyAdd();
        ma.setSize(300, 300);
        ma.setVisible(true);
    }
}
