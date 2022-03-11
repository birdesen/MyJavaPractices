import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance traveled in km: ");

        int km = input.nextInt();
        double perKm = 2.20, startPrice = 10, total;

        total = (km * perKm);
        total += startPrice;

        total = (total < 20 ) ? 20 : total;

        System.out.println("Total amount: " + total);


    }
}
