import java.util.Scanner;

/**
 * Give paycheck for any number of people. Uses an array of objects.
 * 
 * @author (Harold Boyett) 
 * @version (2/13/2017)
 */
public class PaycheckTester
{
    public static void main()
    {
        int numberOfPeople; //total number of paychecks/people
        
        //Temporary variables to get user input
        double tempwage;
        double temphours;
        String tempname;
        
        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people are you paying? ");
        numberOfPeople = scanner.nextInt(); //get number of paychecks
        
        //create array of paycheck objects
        Paycheck[] paychecks = new Paycheck[numberOfPeople + 1];
        
        //for each person create a paycheck
        for(int i = 0; i < numberOfPeople; i++)
        {
            System.out.print("Enter person " + (i+1) + "'s name: ");
            scanner.nextLine();
            tempname = scanner.nextLine();
            System.out.print("Enter person " + (i+1) + "'s wage: ");
            tempwage = scanner.nextDouble();
            System.out.print("Enter person " + (i+1) + "'s hours: ");
            temphours = scanner.nextDouble();
            
            paychecks[i] = new Paycheck(tempname, temphours, tempwage); 
        }
        //print out paycheck values
        for(int i = 0; i < numberOfPeople; i++)
        {
            System.out.println(i+1 + ". Name: " + paychecks[i].getName() + " Paycheck Amount: " + paychecks[i].getCheck());
        }
    }
}
