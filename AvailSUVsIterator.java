public class AvailSUVsIterator implements VehiclesIterator
{
    private Vehicle[] SUV_list;
    private int current;
    public AvailSUVsIterator(Vehicle[] SUV_list)
    {
        this.SUV_list = SUV_list;
        current = 0;
    }
    @Override
    public boolean hasNext()
    {
        return current < SUV_list.length;
    }

    @Override
    public Vehicle next() {
        if(SUV_list[current] instanceof Car)
            return SUV_list[current];
        else
            return null;
    }
}
