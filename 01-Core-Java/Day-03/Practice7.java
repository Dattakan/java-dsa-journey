class Rectangle{
    public int area(int l , int b){
        return l*b;
    }
}

public class Practice7{
    public static void main(String args[]){
        Rectangle rec =new Rectangle();
        int length=7;
        int breadth=6;
        System.out.println("Area of rectangle =" + rec.area(length,breadth));

    }
}