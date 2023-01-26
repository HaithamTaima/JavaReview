package jaafar.examples;

import java.util.Scanner;

public class ScannarExam {
    public static void main(String[]args){
//        String name ="Haitham";
//        System.out.println(name.charAt(2));
//        System.out.println(name.substring(0,6));
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("entr nuom");
//        double x = scanner.nextDouble();
//        System.out.println("entr nuom");
//        String  text =scanner.next();
//        System.out.println("tha valo is : "+x);
//        System.out.println("tha valo is : "+text);
        //------------------------------------------------------  ------------------------------------------

        Scanner scanner=new Scanner(System.in);
        System.out.println("entr (GB) : ");
        double giga=scanner.nextDouble();
        double reslt =giga *1024*1024;
        System.out.println("the of ("+giga+")GB is : "+reslt+" KB ");
        Scanner s = new Scanner (System. in);
        System.out.println("عرض");
        double width = s.nextDouble();
        System.out.println("طول");
        double length = s.nextDouble();

        System. out.println ("عرض سم ب");
        double bWidth = s.nextDouble();
        System.out.println("طول سم ب");

        double bLength = s.nextDouble();
                System. out.println("سعر");
        double price = s.nextDouble();

        double number = (width/ (bWidth/ 100)) * (length/(bLength/100));
        double totalPrice = width * length * price ;

        System. out.println( " عدد" + number);
        System. out.println(" سعر" + totalPrice);


    }
}
