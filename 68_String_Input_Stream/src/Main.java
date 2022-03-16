import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inSS = null;
        String userInfo;
        String firstName;
        String lastName;
        int userAge;

        userInfo = "Amy Smith 19";
        inSS = new Scanner(userInfo);

        firstName = inSS.next();
        lastName = inSS.next();
        userAge = inSS.nextInt();

        System.out.println("First name: "+ firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Age: "+ userAge);
    }
}
