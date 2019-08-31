package GUI_Chapter_12;
import javax.swing.*;
import java.awt.*;

class SimpleGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple");
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
