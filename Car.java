public class Car extends Vehicle
{
    //Constructor
    public Car(String descript, int mpg, String num_value, String VIN)
    {
        super(descript,mpg,num_value,VIN);
    }
    //all cars
    Car car1 = new Car("Chevrolet Camaro", 30, "2", "WG8JM5392DY");
    Car car2 = new Car("Chevrolet Camaro", 30, "2", "KH4GM4564GD");
    Car car3 = new Car("Ford Fusion", 34, "4", "AB4FG5689GM");
    Car car4 = new Car("Ford Fusion Hybrid", 35, "4", "GH2KL4278TK");
    Car car5 = new Car("Ford Fusion Hybrid", 32, "4", "KU4EG3245RW");
    Car car6 = new Car("Chevrolet Impala ", 36, "4", "QD4BK7394Jl");
    Car car7 = new Car("Chevrolet Impala ", 30, "4", "QD4BK7394Jl");
    public String toString()
    {
        String spacer = " ";
        return "Make/Model: " + getDescription() + spacer + "MPG: " + spacer +
                getMPG() + spacer + "Number of seats: " + getNum() + spacer +
                "VIN: " + getVIN();
    }
}
