package jaafar.examples;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        do {
            System.out.println("دخل");
            number=scanner.nextInt();
        }
        while (number<100);
        System.out.println("fsfs"+number);
    }
}
