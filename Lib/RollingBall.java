package Lib;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{

    int x = 100;
    int start_angle = 0;


    public void paintComponent(Graphics g){
        super.paintComponent(g);
            g.drawOval(x, 90, 80, 80);
            g.fillArc(x, 90, 80, 80, start_angle, 180);
    }
    public RollingBall(){
        Timer t = new Timer(100, this);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x -= 5;
        start_angle += 5;
        if (x < -80) {
            x = getWidth() + 15;
        }
        if (start_angle >= 360) {
            start_angle = 0;
        }
        repaint();
    }
}
