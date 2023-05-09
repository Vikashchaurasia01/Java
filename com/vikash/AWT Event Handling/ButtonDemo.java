// Implement the following.
 
// Display which button is being clicked.


import java.awt.*;
import java.awt.event.*;

class MyButton extends Frame {
    Label l1, l2;
    Button b1, b2, b3;

    public MyButton() {
        super("Button Demo");
        l1 = new Label("Complete in action : button");
        l2 = new Label("No button clicked");
        b1 = new Button("Ok");
        b2 = new Button("Submit");
        b3 = new Button("Cancel");

        setLayout(new GridLayout(3, 1));

        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        p.add(b3);

        add(l1);
        add(p);
        add(l2);

        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);

        b1.addActionListener(new MyHandler());
        b2.addActionListener(new MyHandler());
        b3.addActionListener(new MyHandler());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class MyHandler implements ActionListener {

        // @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1)
                l2.setText("Ok button clicked");
            if (e.getSource() == b2)
                l2.setText("Submit button clicked");
            if (e.getSource() == b3)
                l2.setText("Cancel button clicked");
        }
    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        MyButton mb = new MyButton();
        mb.setSize(300, 300);
        mb.setVisible(true);
    }
}