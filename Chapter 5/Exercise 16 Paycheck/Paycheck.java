
/**
 * Paycheck object class
 * 
 * @author (Harold Boyett) 
 * @version (2/13/2017)
 */
public class Paycheck
{
    String name; //name on check
    double hours; //total number of hours worked
    double wage; //hourly wage
    public Paycheck(String n, double h, double w)
    {
        name = n;
        hours = h;
        wage = w;
    }
    
    /**
     *  returns paycheck amount
     */
    public double getCheck()
    {
        double checkAmount = 0.0;
        if(hours > 40)
            checkAmount = ((hours-40) * wage * 1.5) + (wage * 40);
        else if(hours >= 0)
            checkAmount = hours * wage;
        return checkAmount;
    }
    /**
     * returns name on check
     */
    public String getName()
    {
        return name;
    }
}
