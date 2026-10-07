// Print all prime numbers between 1 and 100.

public class Ex8 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Check divisors up to square root of i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Not prime, stop checking further
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}