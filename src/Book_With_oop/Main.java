package Book_With_oop;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("---~------- Main Menu-----------");
            System.out.println("1- --------Display book-------");
            System.out.println("2- -----------Add Bookf-----------");
            System.out.println("3- -----------search-----------");
            System.out.println("4- ----------Delete------------");
            System.out.println("5- ----------update------------");
            System.out.println(" ----------خروج من البرنامج ----------- -6");
            System.out.println("دخل خيارك");
            int choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case 1:
                    //اطبع كل الكتب
                    //---
                    BooK.displayAllBook();
                    break;
                case 2:
                    //عملية الادخال
                    System.out.println("كم عدد الكتب التي تريد ادخالها ");
                    int countBook = scanner.nextInt();
                    if (countBook < 0) {
                        System.out.println("دخل عدد الكتب لازم اكبر من صفر العدد الي تدخله");

                    } else {
                        for (int i = 0; i < countBook; i++) {
                            System.out.println("دخل كتاب " + (i + 1) + "اسم");
                            String nameBook = scanner.next();
                            System.out.println("دخل كتاب " + (i + 1) + "مؤلف");
                            String authorBook = scanner.next();
                            System.out.println("دخل كتاب " + (i + 1) + "سعر");
                            double priceBook = scanner.nextDouble();

                            BooK booK = new BooK();
                            booK.setName(nameBook);
                            booK.setAuthor(authorBook);
                            booK.setPrice(priceBook);

                            BooK.booKArrayList.add(booK);

                        }
                    }
                    break;
                case 3:
                    //بحث

                    break;
                case 4:
                    BooK.deleteBook2(scanner);
                    break;

                case 5:
                    //تعديل
                    //--
                    BooK.updateBooks(scanner);
                    break;

                case 6:
                    // انهاء البرنامج توقيفه من المنيو الاولة
                    existFromApp();
                    break;
            }
        }
    }
   public static void existFromApp(){
        System.exit(0);
   }
}
