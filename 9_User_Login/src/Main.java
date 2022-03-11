import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;

        System.out.print("Enter your name: ");
        userName = inp.nextLine();

        System.out.println("Enter your password: ");
        password = inp.nextLine();

        if(userName.equals("patika")&& password.equals("java123")) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Your information is wrong!\nWould you like to reset your password? y/n :");
            String sifreSifirlama = inp.nextLine();
            if (sifreSifirlama.equals("y")){
                System.out.println("Enter new password: ");
                String newPassword = inp.nextLine();
                if(newPassword.equals("java123")) {
                    System.out.println("Could not create password, please enter another password");
                } else {
                    System.out.println("Password created");
                }
            }
        }
    }
}
