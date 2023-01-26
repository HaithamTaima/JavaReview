package jaafar.examples;

import java.util.Scanner;

public class ForCharAt {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String line = s.nextLine();

        System.out.println("Enter a char:");
        char c = s.next().charAt(0);

        int count = 0;
        for (int i=0;i < line.length(); i++) {
            if (line.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
