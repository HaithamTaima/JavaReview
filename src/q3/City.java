package q3;

import java.util.ArrayList;

class City {
    private String name;
    private ArrayList<Grocery> groceries;

    public City(String name) {
        this.name = name;
        this.groceries = new ArrayList<Grocery>();
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }

//    public void getAllGroceryByEmployeeName(String name) {
//        for (Grocery grocery : groceries) {
//            for (Employee employee : grocery.getEmployees()) {
//                if (employee.getFullName().equals(name)) {
//                    System.out.println(grocery.getName());
//                    break;
//                }
//            }
//        }
//    }
}
