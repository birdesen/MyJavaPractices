import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        int distance = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Please enter your trip type(One way => 1 | Round trip => 2): ");

        int tip = input.nextInt();

        double total = distance * 0.10;
        if (age<12) {
            total = total * 0.50;
        } else if (age>=12 && age<=24) {
            total = total * 0.90;
        } else if (age>65) {
            total = total * 0.70;
        }
        if (tip==2) {
            total =total * 0.80;
        }

        if ((tip !=1 && tip !=2) || (distance<0) || (age<0)) {
            System.out.println("You entered incorrect data");
        }
        else {
            System.out.print("Your flight ticket price: " + total + " TL");
        }
    }
}
