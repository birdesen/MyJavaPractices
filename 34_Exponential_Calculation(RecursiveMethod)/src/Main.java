import java.util.Scanner;
public class Main {

    static int f(int a ,int b) {

        if(b == 0){
            return 1;
        }
        else if(b == 1){
            return a;
        }
        return f(a, b-1) * a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int a = input.nextInt();
        System.out.print("Enter a power number: ");
        int b = input.nextInt();
        System.out.println(a + " ^ " + b + " = " + f(a,b));
    }
}