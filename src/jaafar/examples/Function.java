package jaafar.examples;

public class Function {

    private double radius;
    private String color;

    public Function(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getParms(){
        return  2*Math.PI*radius;
    }
    public double getArea(){
        return  Math.PI*radius*radius;
    }

    /**
     *
     * دواال القيت
     *
     */
    public double getRadius(){
        return this.radius;
    }
    public void  setRadius(double radius){
        if (radius<0)
            return ;
        this.radius=radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

