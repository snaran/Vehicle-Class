public class AvailCarsIterator implements VehiclesIterator
{
    private Vehicle[] car_list;
    private int current;
    public AvailCarsIterator(Vehicle[] car_list)
    {
        this.car_list = car_list;
        current = 0;
    }
    @Override
    public boolean hasNext()
    {
        return current < car_list.length;
    }

    @Override
    public Vehicle next() {
        if(car_list[current] instanceof Car)
            return car_list[current];
        else
            return null;
    }
}
