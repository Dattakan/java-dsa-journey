//Print all factors of the given number.

import java.util.Scanner;

public class Ex22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long i = 1; // changed to long to match 'num'
            while (i <= (num / 2)) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println(num); // print the number itself and add a newline
        }

        sc.close();
    }
}