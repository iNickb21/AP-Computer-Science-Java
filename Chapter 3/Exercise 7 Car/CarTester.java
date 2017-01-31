public class CarTester
{
    public static void main(String[] args)
    {
        Car prius = new Car(50); //50 mpg
        prius.addGas(20); //20 gallon tank
        prius.drive(100); //drive 100 miles
        double gasLeft = prius.getGasInTank();
        System.out.println(gasLeft + " gallons left in the tank");
        
    }
}
