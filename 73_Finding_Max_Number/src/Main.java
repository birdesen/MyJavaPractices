import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int x = input.nextInt();

        System.out.print("Enter second integer number: ");
        int y = input.nextInt();

        if(x>y)
            System.out.println(x + " is greater than " + y);
        else
            System.out.println(y + " is greater than " + x);
    }
}
