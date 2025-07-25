import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // 1. Simple if
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        }

        // 2. if-else
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // 3. if - else if - else
        if (number < 0) {
            System.out.println(number + " is a negative number");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println(number + " is a positive number");
        }

        // 4. Nested if
        if (number > 0) {
            if (number < 100) {
                System.out.println(number + " is positive and less than 100");
            } else {
                System.out.println(number + " is positive and greater than or equal to 100");
            }
        }

        // 5. Ternary operator (shortcut for if-else)
        String message = (number % 5 == 0) ? number + " is divisible by 5" : number + " is not divisible by 5";
        System.out.println(message);
        
        sc.close();
    }
}
