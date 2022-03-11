import java.util.Scanner;
public class Main {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a-b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }
    static int div(int a, int b){
        if (b == 0) {
            System.out.println("the second number must be different by zero");
            return 0;
        }
        int result = a/b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for(int i = 1; i<=b; i++){
            result *= a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
        return result;
    }
    static int factorial(int a, int b){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a+ "! = " + result);
        return result;
    }
    static void calc(int a, int b){
        System.out.println("Perimeter of a rectangle with sides "+ a + " and " + b + " = " + (2*(a+b)));
        System.out.println("Area of a rectangle with sides "+ a + " and " + b + " = " + (a*b));
    }
    static int mod(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition Operation\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Get Mod\n"
                + "8- Rectangular Area and Perimeter Calculation";
        System.out.println(menu);
        while(true){
            System.out.print("Choose an action :");
            select = scan.nextInt();
            System.out.print("Enter first number: ");
            int a = scan.nextInt();
            System.out.print("Enter second number: ");
            int b = scan.nextInt();
            switch(select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a,b);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
                default:
                    System.out.println("You entered an invalid transaction");
            }
        }
    }
}
