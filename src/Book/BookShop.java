package Book;
//https://www.youtube.com/watch?v=py18w30rweM&list=PLqPct7_jffrEHvxs2c_b40KkXktt7DlKs&index=16
//15 BookShop Project مشروع علي ابو حرب

import java.util.ArrayList;
import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        String[] names = new String[100];
        String[] authors = new String[100];
        int[] prices = new int[100];

        int index = -1;
        while (true) {

            System.out.println("---~------- Main Menu-----------");
            System.out.println("1- --------Display book-------");
            System.out.println("2- -----------Add Bookf-----------");
            System.out.println("3- -----------search-----------");
            System.out.println("4- ----------Delete------------");
            System.out.println("5- ----------Exet------------");


            Scanner scanner = new Scanner(System.in);
            System.out.println("دخل خيارك");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //اطبع كل الكتب
                    if (names[0] == null) {
                        System.out.println("فش كتب فاضي");
                        System.out.println("اختر");
                    } else {
                        for (int i = 0; i < index; i++) {
//                            if (names[i]!=null) {
                            System.out.printf("name : %s , author : %s , price : %d %n", names[i], authors[i], prices[i]);
//                            }
                        }
                    }

                    break;
                case 2:
                    //عملية الادخال
                    System.out.println("كم عدد الكتب التي تريد ادخالها ");
                    int numberOfBook = scanner.nextInt();
                    for (int i = 0; i < numberOfBook; i++) {
                        System.out.println("دخل اسم الكتاب ");
                        String name = scanner.next();
                        names[i] = name;
                        System.out.println("دخل اسم المؤلف");
                        String author = scanner.next();
                        authors[i] = author;
                        System.out.println("دخل سعر الكتاب ");
                        int price = scanner.nextInt();
                        prices[i] = price;
                    }
                    break;
                case 3:
                    //بحث
                    System.out.println("دخل اسم الكتاب ");
                    String nameBook = scanner.next();
                    boolean isFind = false;
                    int count = -1;
                    for (String name : names) {
                        if (name == null) continue;
                        count = count + 1;
                        if (name.equals(nameBook)) {
                            isFind = true;
                            System.out.printf("name : %s , author : %s , price : %d %n", names[count], authors[count], prices[count]);

                        }
                    }
                    if (isFind == false) {
                        System.out.println("الكتاب هذا مش موجود ");
                    }

                    break;
                case 4:
                    //حذف
                    System.out.println("دخل اسم الكتاب ");
                    String nameBook1 = scanner.next();
                    boolean isFind1 = false;
                    int count1 = -1;
                    for (String name : names) {
                        if (name == null) continue;
                        count1 = count1 + 1;
                        if (name.equals(nameBook1)) {
                            isFind = true;
                            //جذف
                            for (int i=0;i<index;i++){
                                names[i]=names[i+1];
                            }
                            index--;
                        }
                    }
                    if (isFind1 == false) {
                        System.out.println("الكتاب هذا مش موجود ");
                    }

                    break;

                case 5:
                    //تعديل
                    break;
                case 6:
                    //خروج
                    System.exit(0);
                    break;
            }
        }


    }
}
