//Calculate and print the factorial of a given number

import java.util.Scanner;

public class Ex9 {
    public static void main(String args[]){
        System.out.print("Enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int a=n;
        while(n>=1){
            fact*=n;
            n--;
        }
        System.out.println("Factorial of number "+a+" is "+fact);
        sc.close();
    }
}
