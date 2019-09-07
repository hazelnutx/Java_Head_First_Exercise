package GUI_Chapter_12;

import javax.swing.*;
import java.awt.*;

public class Animate {
    int x = 2;
    int y = 2;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
<<<<<<< HEAD
        JFrame frame = new JFrame("Oh sheet!");
=======
        JFrame frame = new JFrame();
>>>>>>> f7dcc15dfc9e555cbf09b299d890c9300428cda9
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 124; i++, x++, y++) {
            x++;
            drawP.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    class MyDrawP extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);

            g.setColor(Color.blue);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);

        }
    }
}
