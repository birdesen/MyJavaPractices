import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int grade; char letterGrade;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade:");
        grade = input.nextInt();

        if(grade >= 80)
            letterGrade = 'A';
        else if(grade >= 70)
            letterGrade = 'B';
        else if(grade >= 60)
            letterGrade = 'C';
        else if(grade >= 50)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        System.out.println("Your grade is " + letterGrade);
    }
}
