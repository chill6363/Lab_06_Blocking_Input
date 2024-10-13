import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double area;
        double perimeter;
        double hypotenuse;

        String trash;
        boolean done1 = false;
        boolean done2 = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done1 = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }
        } while (!done1);
        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done2 = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input of: " + trash);
            }
        } while (!done2);

        area = width * length;
        perimeter = 2 * width * length;
        hypotenuse = Math.sqrt((width * width) + (length * length));

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The hypotenuse of the rectangle is: " + hypotenuse);
    }
}