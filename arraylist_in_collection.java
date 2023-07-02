package com.company;
import java.util.*;

public class arraylist_in_collection {
    public static void main(String[] args) {
        ArrayList<String> li1=new ArrayList<>();
        ArrayList<String> li2=new ArrayList<String>(5);
        li2.add("sourik");
        li2.add("smriti");
        li2.add("diya");
        li2.add("smriti");
        li2.add("diya");
//        System.out.println(li2.get(1));
        li2.set(1,"smpriti");
//        for(String name:li2){
//            System.out.println(name);
//        }

        li1.add("1");
        li1.add("2");
        li1.add("3");
        li1.add("4");
        li1.add("1");
        li1.add("5");
        li1.add("6");

        li1.addAll(li2);
//        li1.clear();
//        System.out.println(li1.clone());
//        System.out.println(li1.contains("4"));
//        System.out.println(li1.indexOf("1"));
//        System.out.println(li1.lastIndexOf("1"));
//        li1.remove(1);
//        System.out.println(li1.isEmpty());
//        System.out.println(li1);
//        Collections.sort(li2);
//        Collections.sort(li1);

//        for(int i=0;i<=li1.size();i++)
//        {
//            System.out.println(li1.get(i));
//        }
        Iterator<String> itr=li1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
