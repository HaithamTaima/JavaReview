package oop;

public class Parson {
    int age;
    String name;
    Parson(){
        age=12;
        name="hhhhh";
    }

    public Parson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void sayHello(){
        System.out.println("sayHello");
    }

    double addingall(){
        int x =3;
        int f =3;
        int c=x+f;
        return c;
    }

    String getMaseg(String name){
        System.out.println(name);
        return "Heloo: "+name;



    }
}
