public class SystemInterface
{
    private static AgencyRates agency_rates;
    private static Vehicles agency_vehicles;
    private static CorporateAccounts accounts;

    public static void initSystem(){
        agency_rates = new AgencyRates();
        agency_vehicles = new Vehicles();
        accounts = new CorporateAccounts();
    }

    public static String[] getCarRates(){
        Rates r = agency_rates.getCarRate();
        String[] display_lines = new String[2];
        display_lines[0] = "$" + r.getDailyRate() + " per day, " +
                "$" + r.getWeeklyRates() + " per week, " +
                "$" + r.getMonthlyRate() + " per month, ";
        display_lines[1] = "$" + r.getMileCharge() + " per mile, " +
                "$" + r.getDailyInsuranceCharge() + "per day for insurance";

        return display_lines;
    }
    public static String[] getSUVRates(){
        Rates r = agency_rates.getSUBRate();
        String[] display_lines = new String[2];
        display_lines[0] = "$" + r.getDailyRate() + " per day, " +
                "$" + r.getWeeklyRates() + " per week, " +
                "$" + r.getMonthlyRate() + " per month, ";
        display_lines[1] = "$" + r.getMileCharge() + " per mile, " +
                "$" + r.getDailyInsuranceCharge() + "per day for insurance";

        return display_lines;
    }
    public static String[] getTruckRates(){
        Rates r = agency_rates.getTruckRate();
        String[] display_lines = new String[2];
        display_lines[0] = "$" + r.getDailyRate() + " per day, " +
                "$" + r.getWeeklyRates() + " per week, " +
                "$" + r.getMonthlyRate() + " per month, ";
        display_lines[1] = "$" + r.getMileCharge() + " per mile, " +
                "$" + r.getDailyInsuranceCharge() + "per day for insurance";

        return display_lines;

    }
    public static String[] getAvailCars(){
        String[] a = new String[1];
        a[0] = " " +agency_vehicles.getCars();
        return a;
    }
    public static String[] getAvailSUVs(){
        String[] a = new String[1];
        a[0] = " "+agency_vehicles.getSUVs();
        return a;
    }
    public static String[] getAvailTrucks(){
        String[] a = new String[1];
        a[0] = " "+agency_vehicles.getTrucks();
        return a;
    }
    public static String[] calcCost(){
        String[] line = new String[1];
        line[0] = "Cost: "+agency_vehicles.getCost();
        return line;

    }
    public static String[] makeReservation(String name, String creditcard_num, int acctNumber, String rentalPeriodType, int rentalDuration, boolean insuranceSelected){
        String[] a = new String[1];
        Reservation b = new PrivateCustReservation(name, creditcard_num, acctNumber, rentalPeriodType, rentalDuration, insuranceSelected);
        a[0] ="New Reservation made: " + b;
        return a;
    }
    public static String[] displayReservation(String name, String creditcard_num, int acctNumber, String rentalPeriodType, int rentalDuration, boolean insureanceSelected){
        String[] a = new String[1];
        Reservation b;
        b = new PrivateCustReservation(name, creditcard_num, acctNumber, rentalPeriodType, rentalDuration, insureanceSelected);
        a[0] = "" + b;
        return a;
    }
    public static String[] makePrivateReservation(String name, String creditcard_num, int acctNumber, String rentalPeriodType, int rentalDuration, boolean insuranceSelected){
        Vehicle veh;
        Reservation w = new PrivateCustReservation(name, creditcard_num, acctNumber, rentalPeriodType, rentalDuration, insuranceSelected);

        veh = agency_vehicles.getVehicle(name);
        veh.setResv(w);


        Rates r;
        r = null;
        if(veh instanceof Car)
            r = agency_rates.getCarRate();
        else if(veh instanceof SUV)
            r = agency_rates.getSUBRate();
        else if(veh instanceof Truck)
            r = agency_rates.getTruckRate();
        Cost c = new Cost(r.getDailyRate(),r.getWeeklyRates(), r.getMonthlyRate(), r.getMileCharge(), r.getDailyInsuranceCharge());
        veh.setCost(c);
        String[] a = new String[1];
        a[0] = "Made a private customer reservation";
        return a;
    }
}

