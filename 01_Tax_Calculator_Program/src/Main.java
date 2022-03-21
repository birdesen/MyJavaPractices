import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        System.out.print("Enter the fee amount: ");
        amount = input.nextDouble();

        double taxAmount = amount < 1000 ? amount*0.18 : amount*0.08;

        double amountIncludingTax = amount + taxAmount;
        System.out.println("Amount Excludes Tax: " + amount);
        System.out.println("Amount Including Tax: " + amountIncludingTax);
        System.out.println("Tax Amount: " + taxAmount);
    }
}
