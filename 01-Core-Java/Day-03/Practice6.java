class Student{
    public String details(String n, int a){
        String name =n;
        int age=a;
        return "Name: "+name+" Age: "+age;

    }
}

public class Practice6 {
    public static void main(String args[]){
        Student s1 =new Student();
        Student s2 =new Student();
        Student s3 =new Student();
        System.out.println(s1.details("John", 20));
        System.out.println(s2.details("Alice", 22));
        System.out.println(s3.details("Datta", 21));
    }
}
