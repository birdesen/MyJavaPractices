import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        System.out.print("Enter the fee amount: ");
        amount = input.nextDouble();
        System.out.print("Enter the tax rate: ");
        double taxRate = input.nextDouble();
        double taxAmount = amount * taxRate;
        double amountIncludingTax = amount + taxAmount;
        System.out.println("Amount Excludes Tax: " + amount);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Amount Including Tax: " + amountIncludingTax);
    }
}