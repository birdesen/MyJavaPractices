import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;

        System.out.print("Enter your Math grade: ");
        math = input.nextInt();

        System.out.print("Enter your Physics grade: ");
        physics = input.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Enter your Turkish Language grade: ");
        turkish = input.nextInt();

        System.out.print("Enter your History grade: ");
        history = input.nextInt();

        System.out.print("Enter your Music grade: ");
        music = input.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double result = total / 6.0;
        System.out.println("Your average grade: " + result);

    }
}
