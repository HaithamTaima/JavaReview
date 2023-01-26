package jaafar.exampl_shaml;

import java.util.ArrayList;

public record ArrayLists() {
    public static void main(String[]args){

        //Arrylist
        ArrayList<String>arrayList=new ArrayList<String>();
        arrayList.add("dsdsd");
        arrayList.add("dsdsd");
        arrayList.add("dsdsd");
        arrayList.add("dsdsd");
        arrayList.add("dsdsd");
        arrayList.add(3,"dsdsd");
        arrayList.remove(1);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));


    }
}
