//Find and print the sum of all factors of the given number.

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long sum = 0; // long prevents overflow for large sums

            for (int i = 1; i <= (n / 2); i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            sum += n;

            System.out.println("Sum of all factors: " + sum);
        }

        sc.close();
    }
}