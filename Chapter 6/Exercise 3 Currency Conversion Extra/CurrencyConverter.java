
/**
 * Write a description of class CurrencyConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrencyConverter
{
    double conversionRate;
    public CurrencyConverter(double x)
    {
        conversionRate = x;
    }
    public double convert(double amount)
    {
        double amountInEuros;
        amountInEuros = amount / conversionRate;
        return amountInEuros;
    }
}
