package oop.Inheritance;

public class Student extends Parson{
    Student(){
        System.out.println("constractr parson emte");
        super.gitmaseg();
        this.gitmaseg();
    }
    public Student(int age, String name, int hight, int wieght, int id, String address) {
        super(age, name, hight, wieght, id, address);
    }
   @Override
    void eat(){
        super.eat();
       System.out.println("student");
   }
   @Override
    void prinName(){
       System.out.println("");
   }
   void read(){
       System.out.println("red student");
   }

    @Override
    void gitmaseg(){
        System.out.println("in student");
    }
}
