// Print all possible pairs (i, j) where both i and j range from 1 to n.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // changed variable name from 'a' to 'n'

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); // newline after each row
        }
        sc.close();
    }
}