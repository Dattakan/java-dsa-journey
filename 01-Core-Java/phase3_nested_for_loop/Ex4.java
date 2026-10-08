//Print all prime numbers up to n using nested loop checking.   

import java.util.*;

public class Ex4 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.print("The list of all prime numbers till "+n+" = ");
        for(int i=1;i<=n;i++){
            boolean isprime =true;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    isprime=false;
                }
            }
            if (isprime)
            System.out.print(i+" ");
        }
        sc.close();
    }
}
