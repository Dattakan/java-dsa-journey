//Print all numbers between a and b that are divisible by 7.

import java.util.Scanner;

public class Ex21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        long a = sc.nextLong();
        System.out.println("Enter the second number: ");
        long b = sc.nextLong();

        if (a <= b) {
            long i = a;
            while (i <= b) {
                if (i % 7 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println(); // clean line break at the end
        } else {
            System.out.println("Please give the range correctly"); // Capital 'S'
        }

        sc.close();
    }
}