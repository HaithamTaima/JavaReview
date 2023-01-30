package oop.Abstract_And_Interface.exampl;

public class Rectangel extends  Shape {
    @Override
    String getArea(int higth, int width) {
        return "المساحة المستطيل "+(higth*width);
    }
}
