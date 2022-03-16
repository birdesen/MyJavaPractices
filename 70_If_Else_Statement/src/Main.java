import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 3 and 30: ");
        int x = input.nextInt();

        if ((x>=3)&&(x<=30))
            System.out.println(x);
        else
            System.out.println("out of range");
    }
}
