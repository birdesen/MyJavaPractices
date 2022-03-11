import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many kg is a pear?");
        int pear = input.nextInt();
        System.out.print("How many kg is an apple?");
        int apple = input.nextInt();
        System.out.print("How many kg of tomatoes?");
        int tomato = input.nextInt();
        System.out.print("How many kg of banana?");
        int banana = input.nextInt();
        System.out.print("How many kg is the eggplant?");
        int eggplant = input.nextInt();

        double total = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggplant * 5.00;

        System.out.println("Total price: " + total + " $");
    }
}
