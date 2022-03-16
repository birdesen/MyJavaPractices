import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number:");
        int n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your choice: ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1-n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1*n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("A number cannot be divided by zero");
                        break;
                    default:
                        System.out.println("Division: " + (n1/n2));
                }
                break;
            default:
                System.out.println("You made a wrong choice, try again");
        }
    }
}
