import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle segment: ");
        double r = input.nextDouble();

        System.out.print("Enter the center angle of the circle segment: ");
        double a = input.nextDouble();

        double PI = 3.14;

        double sliceArea = a / 360.0 * ( PI * r * r );

        System.out.println("The area of a sliced circle with radius " + r + " and central angle " + a + "is " + sliceArea);
    }
}
