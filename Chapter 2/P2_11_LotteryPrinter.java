import java.util.ArrayList;
import java.util.Random;

public class P2_11_LotteryPrinter
{
    public static void main()
    {
        int maxNum = 49;
        int totalNum = 6;
        ArrayList<Integer> possibleNumbers = new ArrayList<Integer>(maxNum);
        Random rand = new Random();
        
        for(int i = 1; i <= maxNum; i++)
            possibleNumbers.add(i);
        
        System.out.println("The lottery numbers are: ");
        for(int i = 1; i <= totalNum; i++)
        {
            int numChosen = rand.nextInt(possibleNumbers.size());
            System.out.print(possibleNumbers.remove(numChosen) + " ");
        }
        System.out.println();
    }
}
