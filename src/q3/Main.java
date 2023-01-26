package q3;

public class Main {
    public static void main(String[] args) {
        City city = new City("New York");
        Grocery grocery1 = new Grocery("Grocery 1");
        Grocery grocery2 = new Grocery("Grocery 2");
        Grocery grocery3 = new Grocery("Grocery 3");
        Employee employee1 = new Employee(1, "John Smith", 2000, "Manager");
        Employee employee2 = new Employee(2, "Jessica Brown", 1500, "Cashier");
        Employee employee3 = new Employee(3, "Michael Johnson", 1800, "Store Keeper");
        Employee employee4 = new Employee(4, "Emily Davis", 1700, "Store Keeper");
        Product product1 = new Product(1, 10, "Apple", "Fruit", 50);
        Product product2 = new Product(2, 20, "Banana", "Fruit", 40);
        Product product3 = new Product(3, 30, "Carrot", "Vegetable", 30);
        Product product4 = new Product(4, 40, "Broom", "Household", 20);
        Product product5 = new Product(5, 50, "Bread", "Food", 10);
        grocery1.addEmployee(employee1);
        grocery1.addEmployee(employee2);
        grocery2.addEmployee(employee3);
        grocery2.addEmployee(employee4);
        grocery1.addProduct(product1);
        grocery1.addProduct(product2);
        grocery2.addProduct(product3);
        grocery2.addProduct(product4);
        grocery3.addProduct(product5);
        city.addGrocery(grocery1);
        city.addGrocery(grocery2);
        city.addGrocery(grocery3);
//        city.getAllGroceryByEmployeeName("Emily Davis");
    }
}
