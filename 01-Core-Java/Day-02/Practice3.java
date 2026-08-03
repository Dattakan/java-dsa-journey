//Given two numbers:

// Print the larger number.
// Print their sum.
// If the sum is even, print "Even Sum"; otherwise print "Odd Sum".

public class Practice3 {
    public static void main(String args[]){
        int num1=10;
        int num2=20;
        if(num1>num2){
            System.out.println("Larger number: " +num1);
        }
        else{
            System.out.println("Larger number: " +num2);
        }
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        if(sum % 2 == 0){
            System.out.println("Even Sum");
        }
        else{
            System.out.println("Odd Sum");
        }
        
    }
}
