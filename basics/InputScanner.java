import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("\nHello, " + name + "!");
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);

        sc.close();
    }
}