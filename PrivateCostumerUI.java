import java.util.*;
public class PrivateCostumerUI implements UserInterfaces
{
    String[] lines;
    Scanner sc = new Scanner(System.in);
    public void start(){
        boolean terminate = false;
        int selection;

        while (!terminate) {
            displayMenu();
            selection = getSelection();
            execute(selection);        }
    }
    private void displayMenu()
    {
        System.out.println("MAIN MENU - CUSTOMER (regular)");
        System.out.println("1 - Display Car Rates");
        System.out.println("2 - Display SUV Rates");
        System.out.println("3 - Display Truck Rates");
        System.out.println("4 - Display Availible Cars");
        System.out.println("5 - Display Availible SUVs");
        System.out.println("6 - Display Availible Trucks");
        System.out.println("7 - Calculate Estimated Cost");
        System.out.println("8 - Make a Reservation");
        System.out.println("9 - Display your Reservation");
        System.out.println("10 - Cancel your Reservation");

    }
    private int getSelection()
    {
        System.out.println("Enter your selection: ");
        return sc.nextInt();
    }
    private void execute(int sel){

        switch(sel)
        {
            case 1: exec_displayCarRates(); break;
            case 2: exec_displaySUVRates(); break;
            case 3: exec_displayTruckRates(); break;
            case 4: exec_displayAvailCars(); break;
            case 5: exec_displayAvailSUVs(); break;
            case 6: exec_displayAvailTrucks(); break;
            case 7: exec_calcEstimatedCost(); break;
            case 8: exec_makeReservation(); break;
            case 9: exec_displayReservation(); break;
            case 10:exec_cancelReservation(); break;
        }
    }

    private void exec_displayCarRates() {
        lines = SystemInterface.getCarRates();
        displayLines(lines);
    }
    private void exec_displaySUVRates() {
        lines = SystemInterface.getSUVRates();
        displayLines(lines);
    }
    private void exec_displayTruckRates(){
        lines = SystemInterface.getTruckRates();
        displayLines(lines);
    }
    private void exec_displayAvailCars(){
        lines = SystemInterface.getAvailCars();
        displayLines(lines);
    }
    private void exec_displayAvailSUVs(){
        lines = SystemInterface.getAvailSUVs();
        displayLines(lines);
    }
    private void exec_displayAvailTrucks(){
        lines = SystemInterface.getAvailTrucks();
        displayLines(lines);
    }
    private void exec_calcEstimatedCost(){

        lines = SystemInterface.calcCost();
        displayLines(lines);
    }
    private void exec_makeReservation(){
        System.out.println("enter information");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        String d = sc.next();
        int e = sc.nextInt();
        boolean f = sc.nextBoolean();
        lines = SystemInterface.makePrivateReservation(a,b,c,d,e,f);
        displayLines(lines);
    }
    private void exec_displayReservation(){
        System.out.println("enter information");
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        String d = sc.next();
        int e = sc.nextInt();
        boolean f = sc.nextBoolean();
        lines = SystemInterface.displayReservation(a,b,c,d,e,f);
        displayLines(lines);
    }
    private void exec_cancelReservation(){

    }
    private void displayLines(String[] lines)
    {
        for(int i =0;i<lines.length;i++){
            System.out.println(lines[i]);
        }
    }
}
