// Print the Fibonacci series up to the required number of terms.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else {
            long a = 0; // use long to prevent early overflow
            long b = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                long next = a + b;
                a = b;
                b = next;
            }
            System.out.println(); // clean line break at the end
        }

        sc.close();
    }
}