package q2;

class Car {
    private int id;
    private String corp;
    private String color;
    private String date_ind;
    private String type;

    public Car(int id, String corp, String color, String date_ind, String type) {
        this.id = id;
        this.corp = corp;
        this.color = color;
        this.date_ind = date_ind;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDate_ind() {
        return date_ind;
    }

    public void setDate_ind(String date_ind) {
        this.date_ind = date_ind;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}