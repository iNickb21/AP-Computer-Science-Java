public class Converter
{
    double converterFactor;
    public Converter(double aConversionFactor)
    {
       converterFactor = aConversionFactor;
    }

    public double convertTo(double fromMeasurement)
    {
        double result = fromMeasurement * converterFactor;
        return result;
    }
    
    public double convertFrom(double toMeasurement)
    {
        double result = toMeasurement / converterFactor;
        return result;
    }
}
