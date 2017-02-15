public class CashRegisterTester
{
    public static void main (String[] args)
    {
        CashRegister register = new CashRegister();
        
        register.recordPurchase(8.37);
        register.enterPayment(10, 0, 0, 0, 0);
        System.out.println("The change is " + register.giveDollars() + " dollars, " + register.giveQuarters() + " quarters, " + register.giveDimes() + " dimes, " + register.giveNickels() + " nickels, and " + register.givePennies() + " pennies.");
    }
}