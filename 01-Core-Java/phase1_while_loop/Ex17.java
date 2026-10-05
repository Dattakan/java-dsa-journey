//Check whether the given number is a prime number.

import java.util.Scanner;

public class Ex17{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int i=2;
        int count=0;
        while(i<=(num/2)){
            
            if(num%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println("the number is prime number");
        }
        sc.close();
    }
}