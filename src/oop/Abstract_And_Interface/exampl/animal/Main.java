package oop.Abstract_And_Interface.exampl.animal;

public class Main {
    public static void main(String[] args) {
        Eggle eggle=new Eggle();
        printFly(eggle);

        Dog dog=new Dog();


        Cat cat=new Cat();

        printEat(eggle);
    }
    static void printEat(Animal a){
        a.eat();
        System.out.println();
    }
    static void printFly(CanFly canFly){
        canFly.fly();

    }


}
