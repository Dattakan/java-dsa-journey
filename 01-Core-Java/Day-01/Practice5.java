// Given total marks of 5 subjects, calculate:

// Total
// Average

// Use double for the average.

public class Practice5 {
    public static void main(String args[]){
        int math= 96;
        int chem= 89;
        int bio = 88;
        int phy= 94;
        int sanskrit = 99;
        int total= math+chem+phy+bio+sanskrit;
        double average= total/5;
        System.out.println("Total: " + total);;
        System.out.println("average: " + average);

    }
}
