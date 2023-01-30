package oop.Abstract_And_Interface.exampl;

public class Main {
    public static void main(String[] args) {
        Squre squre=new Squre();
        Triangle triangle=new Triangle();

        String ares2=triangle.getArea(3,8);
        System.out.println(ares2);

        String ares=squre.getArea(2,2);
        System.out.println(ares);

    }
}
