//For every number from 1 to n, count and print the total number of its factors.  

import java.util.*;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Factors of "+i+": ");
            for(int j=1;j<=(i/2);j++){
                if(i%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println(i);
        }
        sc.close();
    }
}
