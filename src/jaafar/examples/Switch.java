package jaafar.examples;

import java.util.Scanner;

public class Switch {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("دخل الرقم ");
        int number =scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("دخل صح ");

        }

//        if (number==1){
//            System.out.println("واحد ");
//        }
//        else if (number==2)
//            System.out.println("اثنان");
//        else if (number==3)
//            System.out.println("ثلاثة ");
    }
}
