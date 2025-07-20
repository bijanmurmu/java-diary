import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check odd or even: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Your number is even");
        }
        else
            System.out.println("Your number is odd");
        sc.close();
    }
}