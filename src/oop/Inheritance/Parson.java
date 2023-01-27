package oop.Inheritance;

public class Parson {
    private int age;

    protected String name;
    private int hight;
    private int wieght;
    private int id;
    String address;
Parson(){
    System.out.println("ddd");
}
    public Parson(int age, String name, int hight, int wieght, int id, String address) {
        this.age = age;
        this.name = name;
        this.hight = hight;
        this.wieght = wieght;
        this.id = id;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void eat(){
        System.out.println("eat  Parson: "+this.name+"ali");
    }
    void prinName(){
        System.out.println("prinName");
    }
     void gitmaseg(){
         System.out.println("in Parson");
     }
}
