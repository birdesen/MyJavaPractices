import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math,physics,turkish,chemistry,music;

        System.out.print("Enter your math grade: ");
        math = input.nextInt();
        if (math<0 || math>100) {
            math=0;
        }

        System.out.print("Enter your math grade: ");
        physics = input.nextInt();
        if (physics<0 || physics>100) {
            physics=0;
        }

        System.out.print("Enter your Turkish language grade: ");
        turkish = input.nextInt();
        if (turkish<0 || turkish>100) {
            turkish=0;
        }

        System.out.print("Enter your math grade: ");
        chemistry = input.nextInt();
        if (chemistry<0 || chemistry>100) {
            chemistry=0;
        }

        System.out.print("Enter your math grade: ");
        music = input.nextInt();
        if (music<0 || music>100) {
            music=0;
        }

        double average =(math + physics + turkish + chemistry + music)/5;

        if (average <= 55) {
            System.out.print("You failed the class\nYour average: " + average);
        }   else {
            System.out.print("Congratulations you passed the class\nYour average: " + average);
        }
    }
}
