public class AllVehiclesIterator implements VehiclesIterator
{
    private Vehicle[] veh_list;
    private int current;

    public AllVehiclesIterator(Vehicle[] veh_list)
    {
        this.veh_list = veh_list;
        current = 0;
    }

    @Override
    public boolean hasNext()
    {
        if(current < (veh_list.length-1))
            if(veh_list[current+1] != null)
                return true;
        return false;
    }

    @Override
    public Vehicle next()
    {
        return veh_list[++current];
    }
}
