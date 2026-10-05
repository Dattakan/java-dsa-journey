//Check whether the given number is a Perfect number.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=number/2){
            if (number%i==0){
                sum+=i;
            }
            i++;
        }
        if (number==sum && number!=0)
        System.out.println("The number is a perfect number");
        else
        System.out.println("The number is not a perfect number");
        sc.close();
    }
}
