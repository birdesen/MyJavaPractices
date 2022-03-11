import java.util.Scanner;

public class Main {
    static boolean prime(int n,int i)
    {
        if(n<2)
            return false;
        if(i==1)
            return true;
        else
        {
            if(n % i == 0)
                return false;
            else
                return prime(n, i - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        if (prime(n,n/2) == false)
            System.out.print(n + " is not a prime number");
        else
            System.out.print(n + " is a prime number");
    }
}
