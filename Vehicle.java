abstract class Vehicle
{
    public static String description; // make-model for cars/suvs, length for trucks
    public static int mpg; // miles per gallon
    public static String num; // (num of seats, bench seats, number of rooms of storage)
    public static String VIN; // unique vehicle identification number
    private Reservation resv; // If null, then vehicle not reserved
    private Cost cost; // only assigned when vehicle reserved

    public abstract String toString();

    public Vehicle(String description, int mpg, String num, String VIN)
    {
        this.description = description;
        this.mpg = mpg;
        this.num = num;
        this.VIN = VIN;
        resv = null;
        cost = null;

    }
    //getters for basic information
    public String getDescription()
    {
        return description;
    }
    public int getMPG()
    {
        return mpg;
    }
    public String getNum()
    {
        return num;
    }
    public String getVIN()
    {
        return VIN;
    }

    //Getters and Setters for reservation and cost objects
    public Reservation getResv()
    {
        return resv;
    }
    public void setResv(Reservation resv)
    {
        this.resv = resv;
    }

    public Cost getCost()
    {
        return cost;
    }
    public void setCost(Cost cost)
    {
        this.cost = cost;
    }

    //check if the vehicle is reserved
    public boolean isReserved()
    {
        return resv != null;
    }

    public double calcCost(String time_unit, int num_time_units, int num_miles_driven)
    {
        //Computer total charge before discounts
        double total_chrg = cost.calcCost(time_unit, num_time_units, num_miles_driven, resv.getInsuranceSelected());

        //apply any applicable discounts
        if(resv instanceof CompanyReservation)
            total_chrg = total_chrg * (100 - Rates.Company_discount);

        return total_chrg;
    }
}
