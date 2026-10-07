// Find and print the sum of the Fibonacci series.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative number of terms.");
        } else {
            long a = 0;   // using long to avoid early overflow
            long b = 1;
            long sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += a;
                long next = a + b;
                a = b;
                b = next;
            }

            System.out.println("Sum of Fibonacci series up to " + n + " terms is " + sum);
        }

        sc.close();
    }
}