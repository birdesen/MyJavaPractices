import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, k, max = 0, min = 0;

        System.out.print("How many number will you enter? ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            k = input.nextInt();
            if (i == 0) {
                min = k;
                max = k;
            }
            if (min > k) {
                min = k;
            }
            if (max < k) {
                max = k;
            }
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }
}
