import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character from English Alphabet: ");

        char alphabet = input.next().charAt(0);

        if (alphabet != 'a' && alphabet != 'e' && alphabet != 'i' && alphabet != 'o' && alphabet != 'u')
            System.out.println("You entered a consonant");
        else
            System.out.println("You entered a vowel");

    }
}
