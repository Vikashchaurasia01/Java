// Write a program to implement a mini calculator with basic operation.

import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame {
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    Button addition, subtraction, multiplication, division, reset;

    public Calculator() {
        super("Calculator App");
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        l3 = new Label("Result");
        tf1 = new TextField(80);
        tf2 = new TextField(80);
        tf3 = new TextField(80);
        addition = new Button("+");
        subtraction = new Button("-");
        multiplication = new Button("x");
        division = new Button("/");
        reset = new Button("Reset");

        setLayout(null);

        l1.setBounds(30, 40, 80, 20);
        l2.setBounds(30, 70, 80, 20);
        l3.setBounds(30, 100, 80, 20);

        tf1.setBounds(150, 40, 70, 20);
        tf2.setBounds(150, 70, 70, 20);
        tf3.setBounds(150, 100, 70, 20);

        addition.setBounds(30, 130, 40, 20);
        subtraction.setBounds(80, 130, 40, 20);
        multiplication.setBounds(130, 130, 40, 20);
        division.setBounds(180, 130, 40, 20);
        reset.setBounds(30, 160, 40, 20);

        addition.addActionListener(new MyHandler());
        subtraction.addActionListener(new MyHandler());
        multiplication.addActionListener(new MyHandler());
        division.addActionListener(new MyHandler());
        reset.addActionListener(new MyHandler());

        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(addition);
        add(subtraction);
        add(multiplication);
        add(division);
        add(reset);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class MyHandler implements ActionListener {

        // @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            double ans = 0.0;
            if (e.getSource() != reset) {
                if (e.getSource() == addition) {
                    ans = (double) num1 + num2;
                }
                if (e.getSource() == subtraction) {
                    ans = (double) num1 - num2;
                }
                if (e.getSource() == multiplication) {
                    ans = (double) num1 * num2;
                }
                if (e.getSource() == division) {
                    ans = (double) num1 / num2;
                }
                if (e.getSource() == division) {
                    if (num2 == 0) {
                        tf3.setText("Error");
                        return;
                    }
                    ans = (double) num1 / num2;
                }
                tf3.setText(String.valueOf(ans));
            } else {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setSize(300, 300);
        c.setVisible(true);
    }
}
