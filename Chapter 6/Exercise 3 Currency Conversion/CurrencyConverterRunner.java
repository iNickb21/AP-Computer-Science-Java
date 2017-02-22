import java.util.Scanner;
/**
 * This program prompts for the worth of one dollar in euros, then asks for 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrencyConverterRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many euros equals a dollar?");
        double rate = in.nextDouble();
        
        CurrencyConverter converter = new CurrencyConverter(rate);
        
        while (in.nextLine().compareTo("Q") != 0)
        {
            System.out.println("Enter dollars: ");
            double exchange = in.nextDouble();
            System.out.println(converter.convert(exchange));
        }
        
    }
}
