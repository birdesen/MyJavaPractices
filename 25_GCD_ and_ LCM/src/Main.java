import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1= input.nextInt();

        System.out.print("Enter second number: ");
        int n2= input.nextInt();

        int gcd = 1;
        int i = 1;

        System.out.println("Greatest common divisor =");
        while(i <= n1) {
            if(n1 %i ==0 && n2 %i ==0){
                gcd = i;
                System.out.println(gcd);
            }
            i++;
        }
        System.out.println("-------------------------");

        int lcm = 1;

        while(lcm <= (n1*n2)) {
            if(lcm %n1 ==0 && lcm %n2 ==0){
                System.out.println("Least common multiple = " + lcm);
                break;
            }
            lcm++;
        }
    }
}
