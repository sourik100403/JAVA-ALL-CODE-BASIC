package com.company;
//import java.lang.*;

public class capacitubuffer {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("jihj");
        System.out.println(obj.capacity());
        StringBuffer obj1=new StringBuffer(" ");
        System.out.println(obj1.capacity());
        StringBuffer obj2=new StringBuffer();
        System.out.println(obj2.capacity());
    }
}
