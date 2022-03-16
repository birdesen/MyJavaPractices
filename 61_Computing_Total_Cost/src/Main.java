import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numDrinks;
        int numTacos;
        int totalCost;

        System.out.print("Enter umber of drinks: ");
        numDrinks = scnr.nextInt();

        System.out.print("Enter number of tacos: ");
        numTacos = scnr.nextInt();

        totalCost = 2 * numDrinks + 3 * numTacos;

        System.out.print("Total cost: ");
        System.out.print(totalCost);
    }
}
