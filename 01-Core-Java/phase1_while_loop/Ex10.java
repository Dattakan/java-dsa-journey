//Find and print the product of all digits of a given number

import java.util.Scanner;

public class Ex10{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int prod=1;
        while(n>0){
            int rem=n%10;
            // Any digit being 0 makes the overall product 0
            if (rem == 0) {
                prod = 0;
                break;
            }
            prod*=rem;
            n/=10;
        }
        System.out.println("Product of all the individual digits is "+ prod);
        sc.close();
    }
}