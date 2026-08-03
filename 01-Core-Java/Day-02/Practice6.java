import java.util.Scanner;

public class Practice6 {
    public static void main(String args[]){
        int a=10;
        int b=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("performing addition:"+ a+b );
                break;
            case 2:
                System.out.println("performing subtraction:"+ (a-b) );
                break;
            case 3:
                System.out.println("performing multiplication:"+ (a*b) );
                break;
            case 4:
                System.out.println("performing division:"+ (a/b) );
                break;
        }
    }
}
