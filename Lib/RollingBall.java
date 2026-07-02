package Lib;

import java.awt.Graphics;
import javax.swing.JPanel;

public class RollingBall extends JPanel{
    public void paintComponent(Graphics g){
        g.drawOval(100, 90, 80, 80);
        g.fillArc(100, 90, 80, 80, 0, 180);
    }
}
