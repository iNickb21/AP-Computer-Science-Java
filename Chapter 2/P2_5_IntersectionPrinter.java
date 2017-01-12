import java.awt.Rectangle;

public class P2_5_IntersectionPrinter
{
    public static void main()
    {
        Rectangle r1 = new Rectangle(100,100,50,50),
        r2 = new Rectangle(25,50,100,20),
        r3 = r1.intersection(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
