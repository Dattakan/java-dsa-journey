// Calculate and print the factorial of a given number.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1; // using long to support results up to 20!
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of the given number " + n + " is " + fact);
        }

        sc.close();
    }
}