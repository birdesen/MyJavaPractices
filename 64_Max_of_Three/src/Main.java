import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scnr.nextInt();
        System.out.print("Enter second number: ");
        int b = scnr.nextInt();
        System.out.print("Enter third number: ");
        int c = scnr.nextInt();

        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Maximum value: " +max);

        // Another method:

        int d,e,f, maks;

        System.out.print("Enter first number: "); d = scnr.nextInt();
        System.out.print("Enter second number: "); e = scnr.nextInt();
        System.out.print("Enter third number: "); f = scnr.nextInt();

        maks = Math.max(Math.max(d,e),f);

        System.out.println("Maximum value: " + maks);

        // Another method:

        int g,h,i, mak;

        System.out.print("Enter first number: "); g = scnr.nextInt();
        System.out.print("Enter second number: "); h = scnr.nextInt();
        System.out.print("Enter third number: "); i = scnr.nextInt();

        mak = g;

        if(h > mak)
            mak = h;
        else if (i > mak)
            mak = i;
        System.out.print("Maximum value: " + mak);

    }
}
