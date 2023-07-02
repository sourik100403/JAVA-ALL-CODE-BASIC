/**************************

 I/P:good night madhu
 O/P:
 Good Night Madhu

 ***************************/
package com.company;
import java.util.Scanner;
public class stringbuffer_problem2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StringBuffer s=new StringBuffer();
        System.out.println("enter your text");
        s.append(obj.nextLine());
        s.setCharAt(0,Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s.setCharAt(i+1,Character.toUpperCase(s.charAt(i+1)));
            }
        }
        System.out.println(s);
    }
}
