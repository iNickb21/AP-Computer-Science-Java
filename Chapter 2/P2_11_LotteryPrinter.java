import java.util.*;

public class P2_11_LotteryPrinter
{
    public static void main()
    {
        Random rand = new Random();
        int lotteryNumbers = 6;
        int lotteryMaxNumber = 49;

        for (int i = 0; i < lotteryNumbers; i++)
        {
            System.out.print(rand.nextInt(lotteryMaxNumber) + " " );
        }
    }
}
