import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total=0;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter a number: ");
            n = scan.nextInt();
            if(n % 4 == 0){
                total += n;
            }
        } while(n%2==0);

        System.out.println("Total= " + total);
    }
}
