package oop.Abstract_And_Interface.exampl;

public class Triangle extends Shape {
    @Override
    String getArea(int higth, int width) {
        return "المساحة المربع "+(0.5*higth*width);
    }
}
