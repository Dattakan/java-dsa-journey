//Coun and Print total number of digits in a given number 

import java.util.Scanner;

public class Ex11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        if (n==0){
            count=1;
        }
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("Count of the number of digits in the given number:"+count);
        sc.close();
    }
}
