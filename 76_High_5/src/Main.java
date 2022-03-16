import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice ='y'; int anyNumber = 0;

        System.out.print("Enter choice: ");

        choice = input.next().charAt(0);

        choice=Character.toUpperCase(choice);
        System.out.print("Enter any number: ");
        anyNumber = input.nextInt();

        if(choice =='Y') {
            if(anyNumber ==5){
                System.out.println("High " + anyNumber);
            }
        }
        System.out.println("goodbye");
    }
}
