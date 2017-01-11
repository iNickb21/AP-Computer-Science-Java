import java.awt.Rectangle;

public class P2_2_PerimeterTester
{
    public static void main()
    {
        Rectangle test = new Rectangle(10,10,20,20);
        double area = ((test.getWidth()*2) + (test.getHeight()*2));
        System.out.println(area);
    }
}
