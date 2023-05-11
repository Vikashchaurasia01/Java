import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ILoveYouGUI extends JFrame implements ActionListener {

    private int x = 20;
    private int y = 200;
    private Timer timer;

    public ILoveYouGUI() {
        super("I love you");
        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);
        setVisible(true);

        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        Font font = new Font("Serif", Font.BOLD, 100);
        g.setFont(font);
        g.drawString("I", x, 200);
        g.setColor(Color.RED);
        g.drawString("\u2665", x - 20, 300); // heart symbol
        g.setColor(Color.BLUE);
        g.drawString("  You", x - 120, 400);
        g.setColor(Color.RED);
        g.drawString("Mummy aur Papa", x - 350, 500); // Enter Your Partner Name
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 400) {
            x += 5;
        } else {
            x = 20;
        }
        repaint();
    }

    public static void main(String[] args) {
        new ILoveYouGUI();
    }
}

