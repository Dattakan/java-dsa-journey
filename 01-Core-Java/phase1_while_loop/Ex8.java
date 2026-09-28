//Calculate the sum of all odd numbers from 1 upto n

import java.util.Scanner;

public class Ex8{
    public static void main(String args[]){
        System.out.print("Enter the value of n: ");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        int i= 1;
        while(i<=n){
            if(i%2!=0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of all odd numbers 1 to " + n + "is "+ sum);
        sc.close();
    }
}