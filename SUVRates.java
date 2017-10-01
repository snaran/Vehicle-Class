public class SUVRates extends Rates
{
    //Creates SUV rate
    public SUVRates()
    {
        super(24.95, 189.95, 679.95, 0.15, 14.95);
    }
    public String toString()
    {
        return "SUV rates: "+super.toString();
    }
}
