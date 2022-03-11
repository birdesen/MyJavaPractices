import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (i=1;i<=n;i++) {
            System.out.println((int)Math.pow(4, i) + " " + (int)Math.pow(5, i));
        }
    }
}
