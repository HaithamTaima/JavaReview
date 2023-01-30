package oop.Abstract_And_Interface.exampl;

public class Squre extends Shape {
    @Override
    String getArea(int higth, int width) {
        return "المساحة الدائرة  "+(higth*width);
    }
}
