package com.company;
import java.lang.*;
public class Bufferapendstr {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("NSEC");
        char[] str =new char[10];
        char str1[]={'j','o'};
        obj.append(str1);
        System.out.println(obj);
    }
}
