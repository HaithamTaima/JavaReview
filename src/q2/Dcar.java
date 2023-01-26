package q2;

import java.util.ArrayList;

class Dcar extends Car {
    private int doors;
    private static ArrayList<Dcar> dcarList = new ArrayList<Dcar>();


    public Dcar(int id, String corp, String color, String date_ind, String type, int doors) {
        super(id, corp, color, date_ind, type);
        this.doors = doors;
    }

    public static void addDcarToList(Dcar dcar) {
        dcarList.add(dcar);
    }

    public static int getTotalCars() {
        return dcarList.size();
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}