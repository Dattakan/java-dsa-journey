//Check whether the given number is an Armstrong number.

import java.util.Scanner;

public class Ex14 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        
        int digits= String.valueOf(n).length();
        int num=n;
        
        int sum=0;
        while(n>0){
            int prod=1;
            int d=digits;
            int rem=n%10;
            while(d>0){
                prod = prod*rem;
                d--;
            }
            sum+=prod;
            n/=10;
        }
        if (num==sum)
            System.out.println("The number is an Armstrong number.");
        else
            System.out.println("The number is not an Armstrong number.");
        sc.close();
    }
}
