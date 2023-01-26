package jaafar.examples;

import java.util.Scanner;

public class If_else {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("طول الشارع ");
        int lingth =scanner.nextInt();
        int with=0;
        if (lingth>=0&&lingth<=60){
            with=4;
        }else if (lingth>60&&lingth<=80){
            with=6;
        }
        int area=lingth*with;
        System.out.println("Area : "+area+"\nlingth : "+lingth+"\nwidht : "+with+"");

//        System.out.println("دخل المعدل ");
//        double d = scanner.nextDouble();
//        String resut ="";
//        if (d>=50&&d<=100){
//           resut= "ناجح";
//        }
//        else if (d>100||d<0){
//            resut ="دخل صح ";
//        }
//        else {
//           resut="صاقط";
//        }
//        System.out.println(resut);

    }

}
