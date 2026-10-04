//Check whether the given number is a Perfect number.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a positive integer: ");
        long number = scanner.nextLong();
        long sum = 0;
        long i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i; 
            }
            i++; 
        }
        
        // Compare the sum of divisors with the original number
        if (sum == number && number > 0) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }
        
        scanner.close();
}
