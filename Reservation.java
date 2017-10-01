public class Reservation
{
    private String companyName;
    private String creditCardNumber; // credit card number (reservations have EITHER a credit card
    private int acctNumber; // number OR a company account number stored
    private String rentalPeriodType; // days, weeks, months
    private int rentalDuration; // 1, 2, 3, … (how many days, weeks or months reserving for)
    private boolean insuranceSelected; // set to true if optional daily insurance wanted

    //Constructor
    public Reservation(String companyName, String creditCardNumber, int acctNumber, String rentalPeriodType, int rentalDuration, boolean insuranceSelected)
    {
        this.companyName = companyName;
        this.creditCardNumber = creditCardNumber;
        this.acctNumber = acctNumber;
        this.rentalPeriodType = rentalPeriodType;
        this.rentalDuration = rentalDuration;
        this.insuranceSelected = insuranceSelected;
    }

    //Getters
    public String getCompanyName()
    {
        return companyName;
    }
    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }
    public String getAcctNumber()
    {
        return creditCardNumber;
    }
    public String getRentalPeriodType()
    {
        return rentalPeriodType;
    }
    public int getRentalDuration()
    {
        return rentalDuration;
    }
    public boolean getInsuranceSelected()
    {
        return insuranceSelected;
    }

    //Setters
    public void setCompanyName(String x)
    {
        companyName = x;
    }
    public void setCreditCardNumber(String x)
    {
        creditCardNumber = x;
    }
    public void setAcctNumber(int x)
    {
        acctNumber = x;
    }
    public void setRentalPeriodType(String x)
    {
        rentalPeriodType = x;
    }
    public void setRentalDuration(int x)
    {
        rentalDuration = x;
    }

    public String toString()
    {
        return "Company name: " + companyName + " Credit car number or account Number: " + creditCardNumber + acctNumber + " Rental Period Type: " + rentalPeriodType + " Duration: " +rentalDuration + " Insurance: " + insuranceSelected;
    }


}
