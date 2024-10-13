import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1;

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
    }
}
