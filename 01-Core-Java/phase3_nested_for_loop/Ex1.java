// Print the multiplication tables for all numbers from 1 to 10

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) { // fixed: added space between int and j
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println(); // separates tables cleanly
        }
    }
}