package jaafar.examples;

import java.util.Scanner;

public class Loops {
    //مثال 1

//    public static void main(String[] args) {
//        Scanner s = new Scanner (System. in);
//        System. out.println("Enter a number:") ;
//        int number = s.nextInt();
//        int counter =0;
//        while (counter<=number){
//            if (counter%3==0){
//                System.out.println(counter);
//            }
//            counter++;
//
//        }
//    }
    //مثال 2

    //مثال2

//    public static void main(String[] args) {
//        Scanner s = new Scanner (System. in);
//        System. out.println("Enter a number:") ;
//        int number = s.nextInt();
//
//        while (number<100){
//            System.out.println("دخل رقم تاني ");
//            number=s.nextInt();
//
//        }
//        System.out.println("رقمك اكبر ممتاز يا مطي ");
//    }

    //مثال3

    public static void main(String[] args) {
        Scanner s = new Scanner (System. in);
        System. out.println("Enter a number:") ;
        int number = s.nextInt();
        int counter=0;
        int sum =0;
        while (counter<=number){
            sum+=counter;
            counter++;
        }
        System.out.println("جمع  :"+sum+"  ");
        System.out.println("المتوسط  :"+sum/(counter-1)+"  ");
    }

    }
