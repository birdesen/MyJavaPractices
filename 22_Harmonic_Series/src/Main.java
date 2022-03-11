import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonic Series formula: (1/1)+(1/2)+(1/3)+...+(1/n-1)+(1/n)");
        System.out.print("Enter n number: ");
        int n = input.nextInt();
        double result = 0.0;

        for(int i =1; i<= n ; i++){
            result+=(1.0/i);
            System.out.print("(1/"+ i + ")");
             if(i != n){
                 System.out.print("+");
             }
        }
        System.out.println(" = " + result);
    }
}
