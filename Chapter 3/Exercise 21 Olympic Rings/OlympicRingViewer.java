import javax.swing.JFrame;

public class OlympicRingViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        OlympicRingComponent circles = new OlympicRingComponent();
        
        frame.setSize(550,320);
        frame.add(circles);
        frame.setVisible(true);
    }
}
