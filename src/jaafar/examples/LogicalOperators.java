package jaafar.examples;

import java.util.Scanner;

public class LogicalOperators {
public static void main (String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("entr num");
    int x = scanner.nextInt();
    if (x>=50&&x<=100){
        System.out.println("scsses");
    }
    else if (x>100||x<0){
        System.out.println("دخل تاني ");
    }
    else {
        System.out.println("faild");
    }

}

}
