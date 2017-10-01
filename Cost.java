public class Cost
{
    //Instance Variables for the Cost Class
    private double cost_per_day;
    private double cost_per_week;
    private double cost_per_month;

    private double per_mile_charge;
    private double daily_insur_cost;

    //Constructor for the Cost class
    public Cost(double cost_per_day, double cost_per_week, double cost_per_month, double per_mile_charge, double daily_insur_cost)
    {
        this.cost_per_day = cost_per_day;
        this.cost_per_week = cost_per_week;
        this.cost_per_month = cost_per_month;
        this.per_mile_charge = per_mile_charge;
        this.daily_insur_cost = daily_insur_cost;
    }

    //Getters for the Cost Class
    public double getCost_per_day()
    {
        return cost_per_day;
    }
    public double getCost_per_week()
    {
        return cost_per_week;
    }
    public double getCost_per_month()
    {
        return getCost_per_month();
    }
    public double getPer_mile_charge()
    {
        return per_mile_charge;
    }
    public double getDaily_insur_cost()
    {
        return daily_insur_cost;
    }

    //toString method for cost
    public String toString()
    {
        String spacer = " ";
        return "Cost per day: " + getCost_per_day() + spacer + "Cost per Week: " + getCost_per_week() + spacer + "Cost per month: " + getCost_per_month()
                + spacer + "Cost per mile: " + getPer_mile_charge() + spacer + "Daily Insurance Cost: " + getDaily_insur_cost();
    }

    //Cost Calculator
    public double calcCost(String time_unit, int num_time_units, int num_miles_driven, boolean insur_selected)
    {
        //get the rate for the time unit given(daily, weekly, monthly)
        double unit_rate = 0;
        switch (time_unit)
        {
            case "daily": unit_rate = cost_per_day; break;
            case "weekly": unit_rate = cost_per_week; break;
            case "monthly": unit_rate = cost_per_month; break;
        }

        //get the total insurance cost (if selected by costumer)
        double insur_charge = 0;

        if(insur_selected)
        {
            switch (time_unit)
            {
                case "daily": insur_charge = num_time_units * daily_insur_cost; break;
                case "weekly": insur_charge = num_time_units * daily_insur_cost * 7; break;
                case "monthly": insur_charge = num_time_units*daily_insur_cost*30; break;
            }
        }

        //Determine total vehicle use charge
        double vehicle_use_charge = num_time_units * unit_rate;

        //Determine total mileage charge
        double mileage_charge = num_miles_driven * per_mile_charge;

        //Computer the total charge (before discounts)
        double total_rental_charge = vehicle_use_charge + mileage_charge + insur_charge;
        return unit_rate;
    }
}










