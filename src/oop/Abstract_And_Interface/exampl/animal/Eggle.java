package oop.Abstract_And_Interface.exampl.animal;

public class Eggle implements Animal,CanFly{
    @Override
    public void eat() {
        System.out.println("i can eat");
    }

    @Override
    public void drink() {

    }


    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
