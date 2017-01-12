import java.awt.Rectangle;

public class P2_4_GrowSquarePrinter
{
    public static void main()
    {
        Rectangle square = new Rectangle(100,100,50,50);
        System.out.println(square);
        square.grow(25,25);
        System.out.println(square);
        square.translate(25,25);
        System.out.println(square);
    }
}
