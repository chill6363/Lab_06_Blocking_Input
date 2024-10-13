import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double gallonsGas = 0;
        double fuelEfficiency = 0;
        double gasPerGallon = 0;
        double driveHundredMiles = 0;
        double fullTankDistance = 0;

        String trash;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;

        //Horrible wall of text
        do {    //gallons of gas
            System.out.print("Enter the gallons of gas your tank can fit: ");
            if (in.hasNextDouble()) {
                gallonsGas = in.nextDouble();
                in.nextLine();
                done1 = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }
        } while(!done1);

        do {    //fuel efficiency
            System.out.print("Enter the fuel efficiency of your vehicle: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done2 = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }
        } while(!done2);

        do {    //gas per gallon
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPerGallon = in.nextDouble();
                in.nextLine();
                done3 = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }
        } while(!done3);

        driveHundredMiles = 100 / fuelEfficiency * gasPerGallon;
        fullTankDistance = gallonsGas * fuelEfficiency;

        System.out.println("The cost to drive 100 miles in your car is " + df.format(driveHundredMiles));
        System.out.println("The distance you could drive with a full tank of gas is " + df.format(fullTankDistance));
    }
}
