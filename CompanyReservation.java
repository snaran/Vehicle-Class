public class CompanyReservation extends Reservation
{
    public CompanyReservation(String name, String time_unit, int num_time_units, String acct_num, int rentalDuration, boolean insurance_selected)
    {
        super(name, time_unit, num_time_units, acct_num, rentalDuration, insurance_selected);
    }
}
