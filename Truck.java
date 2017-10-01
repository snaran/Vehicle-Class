public class Truck extends Vehicle
{
    //Constructor
    public Truck(String descript, int mpg, String num_value, String VIN)
    {
        super(descript,mpg,num_value,VIN);
    }
    //implements the toString
    public String toString()
    {
        String spacer = " ";
        return "Make/Model: " + getDescription() + spacer + "MPG: " + spacer +
                getMPG() + spacer + "Number of seats: " + getNum() + spacer +
                "VIN: " + getVIN();
    }
}

