public class CarRates extends Rates
{
    //Creates a car rate
    public CarRates()
    {
        super(24.95, 149.95, 797.95, 0.15, 14.95);
    }
    public String toString()
    {
        return "Car rates: " + super.toString();
    }
}
