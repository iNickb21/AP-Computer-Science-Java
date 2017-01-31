public class SavingsAccount
{
    private double balance;
    private double interestRate;
    
    public SavingsAccount(double initialBalance, double ir)
    {
        balance = initialBalance;
        interestRate = ir; 
    }
    public double getBalance()
    {
        return balance;
    }
    
/*  not needed
    public void deposit(double x)
    {
        balance += x;
    }
    public void withdraw(double x)
    {
        balance -= x;
    }
*/
    public void addInterest()
    {
        balance = balance + (balance*interestRate);
    }
}
