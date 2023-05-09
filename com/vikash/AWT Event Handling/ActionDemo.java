// Java event handling by implementing ActionListener. Implement the following. After click on the button it will display “Welcome”.

import java.awt.*;
import java.awt.event.*;

class MyAction extends Frame {
    TextField tf;
    Button b;

    public MyAction() {
        super("Action Demo");
        tf = new TextField(50);
        b = new Button("Click Me");
        tf.setBounds(40, 40, 100, 20);
        b.setBounds(65, 90, 50, 20);

        setLayout(null);
        add(tf);
        add(b);
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
            if (e.getSource() == b)
                tf.setText("Welcome");
        }
    }
}

public class ActionDemo {
    public static void main(String args[]) {
        MyAction ma = new MyAction();
        ma.setSize(300, 300);
        ma.setVisible(true);
    }
}
