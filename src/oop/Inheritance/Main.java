package oop.Inheritance;

public class Main {
    public static void main(String[]args){
        Parson parson =new Parson(23,"SFSF",123,34,1234,"GAZA");
        System.out.println(parson.name);
        parson.eat();
        parson.prinName();
        System.out.println("-------------------------------");
        Student student=new Student(23,"fefe",23,34,232,"asdda");
        student.eat();
        student.read();
        System.out.println(student.name);
        System.out.println("-------------------------------");
        Parson p =new Parson();
        Student s1=new Student();
        p=s1;
        s1=(Student)p;
        System.out.println("#########################################");
        Student s2=new Student();
        s2.gitmaseg();

    }
}
