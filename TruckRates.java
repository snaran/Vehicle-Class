public class TruckRates extends Rates
{
    //Creates Truck Rates
    public TruckRates()
    {
        super(34.95, 224.95, 797.95, 0.26, 22.95);
    }
    public String toString()
    {
        return "Truck rates: "+super.toString();
    }
}
