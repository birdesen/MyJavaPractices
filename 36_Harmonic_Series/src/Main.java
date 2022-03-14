import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        double[] harmonic= new double[n];
        double sum = 0;

        for(int i = 0; i < n; i++) {
            harmonic[i] = 1.0 / (i + 1);
            sum += harmonic[i];
            System.out.print(harmonic[i]);
            if (i != n-1)
                System.out.print(" + ");
        }
        System.out.println(" ");
        System.out.println("average is " + sum / harmonic.length);
    }
}
