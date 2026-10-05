//Print the Fibonacci series up to n terms.

import java.util.Scanner;


public class Ex18 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int i=1;
        while(i<=n){
           System.out.print(a+" ");
           int next=a+b;
           a=b;
           b=next;
           i++;
        }
        sc.close();
    }
}
