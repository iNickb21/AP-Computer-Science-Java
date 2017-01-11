import java.awt.Rectangle;

public class P2_1_AreaTester
{
    public static void main()
    {
        Rectangle test = new Rectangle(10,10,20,20);
        double area = (test.getWidth() * test.getHeight());
        System.out.println(area);
    }
}
