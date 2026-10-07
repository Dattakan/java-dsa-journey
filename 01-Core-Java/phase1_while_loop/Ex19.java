//Find and print the sum of the Fibonacci series up to n terms.

import java.util.Scanner;

public class Ex19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += a;       // add the current term 'a'
            int next = a + b;
            a = b;
            b = next;
            i++;
        }

        System.out.println("Sum of " + n + " terms of Fibonacci series is " + sum);
        sc.close();
    }
}