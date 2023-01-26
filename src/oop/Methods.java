package oop;

public class Methods {
    public static void main(String[]grgs){
        double x=addOne(10.5);
        System.out.println(x);
    }
    static int addOne(int x){
        return x+1;
    }
    static double addOne(double x){
        return x+1;
    }
    static double addOne(float x){
        return x+1;
    }
    static double addOne(){
        return 1;
    }
    static double getMaxValue(double x,double y,double z){
        double max;
        if (x>y&&x>z){
            max=x;
        }
        return 0.0;
    }

    }
