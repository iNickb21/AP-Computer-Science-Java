import java.util.Scanner;

public class ConverterTester
{
    public static void main(String[] args)
    {
        final double MILE_TO_KM = 1.609;
        final double MILE_TO_FEET = 5280;
        final double FEET_TO_INCHES = 12;
        
        Converter milesToMeters = new Converter(MILE_TO_KM * 1000);
        Converter milesToFeet = new Converter(MILE_TO_FEET);
        Converter feetToInches = new Converter(FEET_TO_INCHES);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of meters: ");
        double numInput = scanner.nextDouble();
        
        double miles = milesToMeters.convertFrom(numInput);
        double feet = milesToFeet.convertTo(miles);
        double inches = feetToInches.convertTo(feet);
        System.out.println(numInput + " meteres is equal to " + miles + " miles, " + feet + " feet, and " + inches + " inches." );
    }
}
