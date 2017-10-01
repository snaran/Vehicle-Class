/**
 * Created by Sam on 4/30/17.
 */
public class AvailTrucksIterator implements VehiclesIterator
{
    private Vehicle[] truck_list;
    private int current;
    public AvailTrucksIterator(Vehicle[] truck_list)
    {
        this.truck_list = truck_list;
        current = 0;
    }
    @Override
    public boolean hasNext()
    {
        return current < truck_list.length;
    }

    @Override
    public Vehicle next() {
        if(truck_list[current] instanceof Car)
            return truck_list[current];
        else
            return null;
    }
}
