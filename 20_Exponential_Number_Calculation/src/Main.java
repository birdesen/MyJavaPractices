import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k, total;
        System.out.print("Enter a base number: ");
        n = input.nextInt();
        System.out.print("Enter a power number: ");
        k = input.nextInt();
        total  = 1;
        // n^k
        for(int i = 1; i<=k ;i++){
            total *= n;
        }
        System.out.println(n + " ^ " + k + " = " + total);
    }
}
