package q3;
import java.util.ArrayList;

class Grocery {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<Product> products;

    public Grocery(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
        this.products = new ArrayList<Product>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

//    public boolean removeEmployee(int id) {
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getId() == id) {
//                employees.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            employee.printInformation();
        }
    }

//    public double totalSalary() {
//        double total = 0;
//        for (Employee employee : employees) {
//            total += employee.getSalary();
//        }
//        return total;
//    }

    public void addProduct(Product product) {
        products.add(product);
    }

//    public boolean removeProduct(int id) {
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getId() == id) {
//                products.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }

    public int countProduct() {
        return products.size();
    }

//    public double totalCapitalValue() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.getPrice() * product.getQuantity();
//        }
//        return total;
//    }
//    public Product getAlmostEndQuantity() {
//        for (Product product : products) {
//            if (product.getQuantity() < 10) {
//                return product;
//            }
//        }
//        return null;
//    }
}
