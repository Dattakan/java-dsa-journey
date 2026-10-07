// Calculate and print the factorial of every number from 1 to n.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
        } else {
            long fact = 1; // long prevents overflow up to 20!
            for (int j = 1; j <= n; j++) {
                fact *= j; // (j)! = (j-1)! * j
                System.out.println("Factorial of the given number " + j + " is " + fact);
            }
        }

        sc.close();
    }
}