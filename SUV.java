public class SUV extends Vehicle
{
    //Constructor
    public SUV(String descript, int mpg, String num_value, String VIN)
    {
        super(descript,mpg,num_value,VIN);
    }
    public String toString()
    {
        String spacer = " ";
        return "Make/Model: " + getDescription() + spacer + "MPG: " + spacer +
                getMPG() + spacer + "Number of seats: " + getNum() + spacer +
                "VIN: " + getVIN();
    }
}
