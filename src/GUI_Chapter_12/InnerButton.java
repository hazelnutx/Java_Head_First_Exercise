package GUI_Chapter_12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerButton {
    JFrame frame;
    JButton b;

    public static void main(String[] args){
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        b.addActionListener(new BListiner());

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setVisible(true);
        frame.setSize(200, 100);
    }

    class BListiner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(b.getText().equals("A")) {
                b.setText("B");
            } else b.setText("A");
        }
    }
}
