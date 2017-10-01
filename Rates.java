public class Rates {
    //Private values for the rate class
    private double daily_rate;
    private double weekly_rate;
    private double monthly_rate;
    private double perMile_chrg;
    private double daily_insur;

    //15% discount to companies for all vehicle types
    public static final double Company_discount = 0.15;

    //Constructor for the rates class


    public Rates(double d, double w, double m, double pmc, double insur) {
        daily_rate = d;
        weekly_rate = w;
        monthly_rate = m;
        perMile_chrg = pmc;
        daily_insur = insur;
    }
    //getters of all instance variables
    public double getDailyRate()
    {
        return daily_rate;
    }
    public double getWeeklyRates()
    {
        return weekly_rate;
    }
    public double getMonthlyRate()
    {
        return monthly_rate;
    }

    public double getMileCharge()
    {
        return perMile_chrg;
    }
    public double getDailyInsuranceCharge()
    {
        return daily_insur;
    }

}