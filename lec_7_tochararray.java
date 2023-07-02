package com.company;

public class lec_7_tochararray {
    public static void main(String[] args) {
        String s="NSEC";
        int i=s.length();
        char ch[]=new char[i];
        ch=s.toCharArray();
        for(int j=0;j<1;j++)
        {
            System.out.println(ch[j]);
        }
    }
}
