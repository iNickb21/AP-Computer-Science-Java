import java.awt.Rectangle;

public class P2_3_FourRectanglePrinter
{
    public static void main()
    {
        Rectangle test = new Rectangle(0,20,10,10);
        System.out.println(test);
        test.translate(10,0);
        System.out.println(test);
        test.translate(0,-10);
        System.out.println(test);
        test.translate(-10,0);
        System.out.println(test);
    }
}
