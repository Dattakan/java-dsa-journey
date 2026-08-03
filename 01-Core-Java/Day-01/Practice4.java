//Convert a double into an int using type casting.Print both values and observe the data loss.

public class Practice4 {
    public static void main(String args[]){
        double num1= 10.5;
        int num2= (int) num1;
        System.out.println("Before: " + num1);
        System.out.println("After: " + num2);

    }
}
