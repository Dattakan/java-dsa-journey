// Print the powers of each number from 1 to n.

import java.util.Scanner;

public class Ex20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till which number do you want to see the powered values: ");
        int n = sc.nextInt();
        System.out.print("Enter the Power: ");
        int m = sc.nextInt();

        if (m < 0) {
            System.out.println("Negative powers are not supported for integer output.");
        } else {
            int i = 1;
            while (i <= n) {
                int x = m;
                long value = 1; // long avoids rapid integer overflow

                while (x > 0) {
                    value *= i;
                    x--;
                }

                System.out.println(i + "^" + m + " = " + value);
                i++;
            }
        }

        sc.close();
    }
}