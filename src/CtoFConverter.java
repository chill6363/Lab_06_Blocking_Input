import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 32;
        String trash;
        boolean done = false;
        do {
            System.out.print("Enter the temperature (Celsius): ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }

        } while (!done);

        tempF = (tempC * 1.8) + 32;
        if (tempF >= 212){
            System.out.println("Your temperature in Fahrenheit is: " + tempF + ". It is at a boiling temperature!");
        }
        else if (tempF <= 32){
            System.out.println("Your temperature in Fahrenheit is: " + tempF + ". It is at a freezing temperature!");
        }
        else{
            System.out.println("Your temperature in Fahrenheit is: " + tempF);
        }
    }
}
