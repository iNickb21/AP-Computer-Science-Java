public class Car
{
    double efficiency;
    double gas;
    public Car(double eff)
    {
        efficiency = eff;
        gas = 0;
    }
    public void addGas(double g)
    {
        gas = gas + g;
    }
    public void drive(double m)
    {
        gas = gas - ( m/efficiency);
    }
    public double getGasInTank()
    {
        return gas;
    }
}
