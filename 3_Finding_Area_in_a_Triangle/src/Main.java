import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the 1st side of the triangle: ");
        double a = input.nextDouble();

        System.out.print("Enter the length of the 2nd side of the triangle: ");
        double b = input.nextDouble();

        System.out.print("Enter the length of the 3th side of the triangle: ");
        double c = input.nextDouble();

        // perimeter of triangle = 2u
        double u = (a + b + c) /2.0;

        // area * area = u * (u - a) * (u - b) * (u - c)
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area of triangle with sides" + a + b + c + " is " + area);

    }
}
