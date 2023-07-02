package com.company;

public class lec7_length_string {
    public static void main(String[] args) {
        String s=new String("sourik");
        String ob=new  String("sourik");
        int length=s.length();
        int length1=ob.length();
        if(length==length1)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
//        System.out.println(length+" "+length1);

    }
}
