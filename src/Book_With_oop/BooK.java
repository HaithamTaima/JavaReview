package Book_With_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class BooK {
    static ArrayList<BooK> booKArrayList=new ArrayList();

    private String name;
    private double price;
    private String author;

    public BooK(){

    }
    public BooK(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void updateBooks(Scanner scanner) {
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("---~------- update Menu-----------");
            System.out.println("1- --------update Book Name-------");
            System.out.println("2- -----------update Book Author-----------");
            System.out.println("3- -----------update Book price-----------");
            System.out.println("4- ----------Back to Main Menu ------------");
            System.out.println("5- ----------Exet------------");
            System.out.println("دخل خيارك");


            int choiceNumber1 = scanner.nextInt();
            switch (choiceNumber1) {
                case 1:
                    System.out.println("دخل اسم الكتاب الي رح تعدله ");
                    String booKName = scanner.next();
                    BooK oldBook = BooK.getBookByName(booKName);
                    BooK newBook = BooK.getBookByName(booKName);
                    if (oldBook == null) {
                        System.out.println("مفش كتاب بهذا الاسم ");
                    } else {
                        System.out.println("دخل اسم الكتاب الجديد ");

                        String newName = scanner.next();


                        newBook.setName(newName);
                        if (BooK.updateBook(newBook, oldBook)) {
                            System.out.println("تم التعديل بنجاح ");
                        } else {
                            System.out.println("فشل التعديل ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("دخل اسم  الي رح تعدله ");
                    String booKName1 = scanner.next();
                    BooK oldBook1 = BooK.getBookByName(booKName1);
                    BooK newBook1 = BooK.getBookByName(booKName1);
                    if (oldBook1 == null) {
                        System.out.println("مفش كتاب بهذا الاسم ");
                    } else {
                        System.out.println("دخل اسم المؤلف الجديد ");

                        String newAuthor = scanner.next();


                        newBook1.setAuthor(newAuthor);
                        if (BooK.updateBook(newBook1, oldBook1)) {
                            System.out.println("تم التعديل بنجاح ");
                        } else {
                            System.out.println("فشل التعديل ");
                        }
                    }
                    break;

                case 3:
                    ///
                    break;
                case 4:
                    //خروج
                    isMenu = false;

                    break;
                case 5:
                    // انهاء البرنامج توقيفه من المنيو الثانية تعت التعديل
                    Main.existFromApp();
                    break;
            }


        }
    }

    public static void deleteBook2(Scanner scanner) {
        //حذف
        System.out.println("دخل اسم الكتاب الي بدك تحدفه ");
        String bookName=scanner.next();
        BooK booK= BooK.getBookByName(bookName);
        if (booK==null){
            System.out.println("الكتاب مش موجود");
        }else {
            //delet
            if (BooK.deleteBook(booK)){
                System.out.println("تم الحذف بنجاح ");
            }
            else {
                System.out.println("فشل الحذف");
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public static void displayAllBook(){
        ArrayList<BooK> booKArrayList = BooK.booKArrayList;
        if (booKArrayList.isEmpty()) {
            System.out.println("مفش كتب ");
        } else {
            System.out.println("الاسم                       المؤلف                         السعر ");
            for (BooK booK : booKArrayList) {
                System.out.println(booK.getName()+"                              "
                +booK.getAuthor()+"                       "+booK.getPrice());
            }
        }
    }
    public static void addBook(Scanner scanner){
//        System.out.println("كم عدد الكتب التي تريد ادخالها ");
//        int countBook=scanner.nextInt();
//        if (countBook<0){
//            System.out.println("دخل عدد الكتب لازم اكبر من صفر العدد الي تدخله");
//
//        }else {
//            for (int i=0;i<countBook;i++){
//                System.out.println("دخل كتاب "+(i+1)+"اسم");
//                String nameBook =scanner.next();
//                System.out.println("دخل كتاب "+(i+1)+"مؤلف");
//                String authorBook =scanner.next();
//                System.out.println("دخل كتاب "+(i+1)+"سعر");
//                double priceBook=scanner.nextDouble();
//
//                BooK booK =new Book();
//                booK.setName(nameBook);
//                booK.setAuthor(authorBook);
//                booK.setPrice(priceBook);
//
//                BooK.booKArrayList.add(booK);
//
//            }
//        }
    }
    public static BooK getBookByName(String name){
        for (BooK booK :booKArrayList){
            if (booK.name.equals(name)){
                return booK;
            }
        }
        return null;
    }

    public static boolean updateBook(BooK newBook, BooK oldBook){
        int index =-1;
        for (int i=0;i<booKArrayList.size();i++){
            if (booKArrayList.get(i).getName().equals(oldBook.getName())){
                index=i;
                break;
            }
        }
        if (index!=-1){
            booKArrayList.get(index).setName(newBook.getName());
            booKArrayList.get(index).setAuthor(newBook.getAuthor());
            booKArrayList.get(index).setPrice(newBook.getPrice());

        }
        return true;
    }
    public static boolean deleteBook(BooK booK) {
        if (!booKArrayList.isEmpty()){
            booKArrayList.remove(booK);
            return true;
        }
        return false;

    }

}
