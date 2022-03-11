import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * 5 * ... * n
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a factorial number: ");
        int n = scan.nextInt();
        int total = 1;

        for(int i = 1; i<= n; i++){
            total = total * i;
        }
        System.out.println(n + ". factorial= " + total);
    }
}
