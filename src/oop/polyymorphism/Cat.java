package oop.polyymorphism;

public class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("miaaawww");
    }
    public void run(){
        System.out.println("can run ");
    }

}
