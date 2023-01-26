package jaafar.exampl_shaml;

import java.util.Scanner;

public class Arrays {
    static  int length =10;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double data[]=new double[length];
        int index =0;
        while (scanner.hasNextDouble()&&index<length){
            data[index]=scanner.nextDouble();
            index++;
        }
        for (int i=0; i<data.length;i++){
            System.out.println(data[i]);

        }
    }
}
