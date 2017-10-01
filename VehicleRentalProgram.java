import java.util.Scanner;
public class VehicleRentalProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        UserInterfaces ui = null;

        SystemInterface.initSystem();
        System.out.println("Enter in a number corresponding to what you are (1 for Private Customer. 2 for Corprate, or 3 for a manager)");
        int selection = sc.nextInt();

        // prompt for UI type (Private customer, Corporate customer, or Manager)
        switch(selection)
        {
            case 1: ui = new PrivateCostumerUI(); break;
            case 2: ui = new CorporateCustomerUI(); break;
            case 3: ui = new ManagerUI(); break;
        }
        ui.start();
    }
}
