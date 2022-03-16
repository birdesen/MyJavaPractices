import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userAgeYears;
        int userAgeDays;
        int userAgeMinutes;

        System.out.print("Enter your ages in years: ");
        userAgeYears = scnr.nextInt();

        userAgeDays = userAgeYears * 365;
        userAgeDays = userAgeYears + (userAgeDays / 4);

        System.out.println("You are " + userAgeDays + " days old.");

        userAgeMinutes = userAgeDays * 24 * 60;

        System.out.println("You are " + userAgeMinutes + " minutes old." );
    }
}
