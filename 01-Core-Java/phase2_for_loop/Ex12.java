//Print all factors of the given number.

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= (n / 2); i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(n);
        }

        sc.close(); // moved inside main
    }
}