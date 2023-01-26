package jaafar.examples;

import java.util.Scanner;

public class Employ_if_else {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("خل اسم الوظف ");
        String name=scanner.nextLine();
        System.out.println("دخل العمر ");
        int age =scanner.nextInt();
        System.out.println("دخل الرتبة");
        int avg =scanner.nextInt();
        int salare=0;
        if (age>=20&&age<30){
            if (avg==1||avg==2||avg==3)
                salare=1500;
            else if (avg==4)
                salare =2500;
//            System.out.println(": الاسم "+name+"\n العمر "+age+"\nالراتة "+avg+"\nالراتب : 1500");
        }
        else if (age>=30&&age<50&&(avg==1||avg==2||avg==3)){
            salare=2000;
//            System.out.println(": الاسم "+name+"\n العمر "+age+"\nالراتة "+avg+"\nالراتب : 2000");
        }
        else if (age>=30&&age<50&&(avg==4||avg==5)){
            salare=4000;
//            System.out.println(": الاسم "+name+"\n العمر "+age+"\nالراتة "+avg+"\nالراتب : 4000");
        }
        System.out.println(": الاسم "+name+"\n العمر "+age+"\nالراتة "+avg+"\nالراتب : "+salare+"");


    }
}
