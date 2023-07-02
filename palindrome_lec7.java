package com.company;
import java.util.Scanner;

public class palindrome_lec7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your text");
        String s=sc.nextLine();
        char a[]=new char[s.length()];
        for(int i=s.length()-1,j=0;i>=0;i--,j++)
        {
            a[j]=s.charAt(i);
        }
        String rev=new String(a);
        System.out.println("reverse string is="+rev);
        if(s.compareTo(rev)==0)
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
