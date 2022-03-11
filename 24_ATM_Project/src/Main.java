import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Enter your user name: ");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the We Are Coding Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance Inquiry\n" +
                            "4-Log Out");
                    System.out.print("Please select the action you want to do: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Money amount: ");
                            int value = input.nextInt();
                            balance += value;
                            break;
                        case 2:
                            System.out.print("Money amount: ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            System.out.println("See you again");
                            break;
                        default:
                            System.out.println("You have entered invalid");
                    }
                } while(select != 4);
                break;

            }else {
                right--;
                System.out.println("Wrong username or password. Try again");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank");
                } else {
                    System.out.println("Your Remaining Rights: " + right);
                }
            }
        }
    }
}
