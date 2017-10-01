public class PrivateCustReservation extends Reservation
{
    // throws exception if the string credit_card is not a valid credit card number (i.e., 16 digits)
    public PrivateCustReservation(String name, String creditcard_num, int acctNumber, String rentalPeriodType, int rentalDuration, boolean insuranceSelected)
    {
        super(name, creditcard_num, acctNumber, rentalPeriodType, rentalDuration, insuranceSelected);
    }
    // toString
    public String toString() {

        return ""+super.toString();

    }
}
