package q3;

public class Product {
    private int id;
    private double price;
    private String name;
    private String type;
    private int quantity;

    public Product(int id, double price, String name, String type, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public void printInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
    }
}

