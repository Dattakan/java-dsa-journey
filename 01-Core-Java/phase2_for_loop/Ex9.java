//Check whether the given number is a prime number.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // 0, 1, and negative numbers are not prime
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            boolean isPrime = true;

            for (int i = 2; i * i <= n; i++) { // i * i <= n is much faster than n / 2
                if (n % i == 0) {
                    isPrime = false;
                    break; // stop early once a factor is found
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }

        sc.close();
    }
}