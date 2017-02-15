public class CashRegister
{
    public static final double DOLLAR_VALUE = 1.00;
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
    private double payment;
    private double purchase;
    private double remainder;
    private double balance;
    public CashRegister()
    {
        payment = 0;
        purchase = 0;
        balance = 0;
        remainder = 0;
    }
    public void recordPurchase(double amount)
    {
        purchase = amount;
        balance = payment - purchase;
    }
    public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
        balance = payment - purchase;
    }
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    public int giveDollars()
    {
        int dollars = (int) (balance / 1.00);
        remainder = balance % 1.00;
        return dollars;
    }
    public int giveQuarters()
    {
        int quarters = (int) (remainder /QUARTER_VALUE);
        remainder = balance % QUARTER_VALUE;
        return quarters;
    }
    public int giveDimes()
    {
        int dimes = (int) (remainder /DIME_VALUE);
        remainder = balance % DIME_VALUE;
        return dimes;
    }
    public int giveNickels()
    {
        int nickels = (int) (remainder /NICKEL_VALUE);
        remainder = balance % NICKEL_VALUE;
        return nickels;
    }
    public int givePennies()
    {
        int pennies = (int) (remainder /PENNY_VALUE);
        remainder = balance % PENNY_VALUE;
        return pennies;
    }
}