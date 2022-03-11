import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, counter=0, total=0, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        if (n < 12) {
            System.out.println("There are no number divisible by both 3 and 4");
        } else {
            System.out.print("Numbers divisible by both 3 and 4: ");
            for (int i =1 ; i<n ; i++) {
                if (i%3 == 0 && i%4 == 0) {
                    System.out.print(i + " ");
                    total += i;
                    counter++;
                }
            }
            System.out.println(" ");
            System.out.println("Average of numbers divisible by both 3 and 4: " + (average= total / counter));
        }
    }
}
