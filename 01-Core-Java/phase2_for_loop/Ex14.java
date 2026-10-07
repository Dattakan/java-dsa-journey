// Find the HCF of two numbers using a for loop.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Work with absolute values to support negative numbers
        a = Math.abs(a);
        b = Math.abs(b);

        int min = (a < b) ? a : b;
        int hcf = 1;

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break; // Largest common factor found, stop immediately
            }
        }

        System.out.println("HCF is: " + hcf);
        sc.close();
    }
}