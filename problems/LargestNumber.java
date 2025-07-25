import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int n = sc.nextInt();
        int largest = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
