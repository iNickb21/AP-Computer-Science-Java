import javax.swing.*;
import java.awt.*;

public class OlympicRingComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setStroke(new BasicStroke(10));

        g.setColor(Color.BLUE);
        g.drawOval(25,25,150,150);
        g.setColor(Color.YELLOW);
        g.drawOval(110,100,150,150);
        g.setColor(Color.BLACK);
        g.drawOval(195,25,150,150);
        g.setColor(Color.GREEN);
        g.drawOval(280,100,150,150);
        g.setColor(Color.RED);
        g.drawOval(365,25,150,150);
    }
}
