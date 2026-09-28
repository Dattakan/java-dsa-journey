//calculate and print the sum of the first n natural numbers using while loop

import java.util.Scanner;

public class Ex6{
    public static void main(String args[]){
            Scanner scanner =new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n=scanner.nextInt();
            int i=1;
            int sum=0;
            while(i<=n){
                sum+=i;
                i++;
            }
            System.out.println("The sum of first "+n+" natural numbers is: "+sum);
            scanner.close();

    }
}