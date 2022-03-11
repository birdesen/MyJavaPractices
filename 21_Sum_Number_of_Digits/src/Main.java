import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int newNumber = number;
        int sumDigit = 0;

        while(newNumber !=0) {
            sumDigit += newNumber % 10;
            newNumber /= 10;
        }

        System.out.println("The sum of the digits of the number " + number + " is " + sumDigit);
    }
}
