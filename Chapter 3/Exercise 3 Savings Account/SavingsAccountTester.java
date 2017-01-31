public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount acc = new SavingsAccount(1000,0.10);
        System.out.println("Balance before adding interest: " + acc.getBalance());
        acc.addInterest();
        System.out.println("Balance after adding interest: " + acc.getBalance());
    }
}
