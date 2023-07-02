/**************************
 Get 3 strings in 3 lines as input
 Soumen
 Hello
 Good Night
 O/P:
 S””m”n
 *e**o
 good night
 ***************************/
package com.company;
import java.util.*;

public class stringbuffer_problem1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        StringBuffer s=new StringBuffer();
        System.out.println("enter your text here");
        s.append(obj.nextLine());

        StringBuffer s1=new StringBuffer();
        System.out.println("enter your text here");
        s1.append(obj.nextLine());

        StringBuffer s2=new StringBuffer();
        System.out.println("enter your text here");
        s2.append(obj.nextLine());

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O'|| s.charAt(i)=='u' || s.charAt(i)=='U')
                s.setCharAt(i,'"');
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='A' || s1.charAt(i)=='e' || s1.charAt(i)=='E' || s1.charAt(i)=='i' || s1.charAt(i)=='I' || s1.charAt(i)=='o' || s1.charAt(i)=='O'|| s1.charAt(i)=='u' || s1.charAt(i)=='U')
                continue;
            else
            {
                s1.setCharAt(i,'*');
            }
        }
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2.toString().toLowerCase());

    }
}
