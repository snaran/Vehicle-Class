public class Vehicles extends Vehicle
{
    private Vehicle[] list;

    public Vehicles()
    {
        super(description,mpg,num,VIN);
        list = new Vehicle[20];
    }
    public Vehicle getVehicle(String vin){
        for(int i=0;i<list.length;i++){
            if(list[i].getVIN().equals(vin)){
                return list[i];
            }
            else
                System.out.println("No such VIN exists.");
        }
        return null;
    }
    public Vehicle[] getCars(){
        Vehicle[] b = new Vehicle[list.length];
        for(int i=0;i<list.length;i++){
            if(list[i] instanceof Car)
                b[i] = list[i];

        }
        return b;
    }
    public Vehicle[] getSUVs(){
        Vehicle[] b = new Vehicle[list.length];
        for(int i=0;i<list.length;i++){
            if(list[i] instanceof SUV)
                b[i] = list[i];

        }
        return b;
    }
    public Vehicle[] getTrucks(){
        Vehicle[] b = new Vehicle[list.length];
        for(int i=0;i<list.length;i++){
            if(list[i] instanceof Truck)
                b[i] = list[i];

        }
        return b;
    }

    public String toString(){
        return "Description: " + super.getDescription() + " MPG:" +super.getMPG() +
                " VIN: " +super.getVIN() + " Reservation: " + super.getResv() + " Cost: "  + super.getCost();
    }
}
