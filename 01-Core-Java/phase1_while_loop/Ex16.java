//Print all prime numbers between 1 and 100.
public class Ex16 {
    public static void main(String args[]){
        int i=2;
        while(i<=100){
            int count=0;
            int j=1;
            while(j<=(i/2)){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if (count==1)
            System.out.println(i);
            i++;
        }
    }
    
}
