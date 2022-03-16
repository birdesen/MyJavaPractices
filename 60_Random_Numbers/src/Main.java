import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //if number1<number2 swap number 1 with number 2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //prompt the student to answer "what is number1 - number2?
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input =new Scanner(System.in);
        int answer = input.nextInt();

        //grade the answer and display th result
        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
