import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int yil = input.nextInt();

        if (yil % 4 == 0){
            if ((yil %100 == 0) && (yil %400 !=0)) {
                System.out.println(yil + " is not a leap year");
            }else {
                System.out.println(yil + " is a leap year");
            }
        }
        else {
            System.out.println(yil + " is not a leap year");
        }
    }
}
