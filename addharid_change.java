//input
//        addhar name=sourik parui
//        addhar id=98987
//          date of barth=10/04/2003
//  output
//        addhar name=souik parui
//        id=same
//        date of barth=10/05/2003
package com.company;
import java.util.Scanner;

public class addharid_change {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //taking addhar id
        StringBuffer s=new StringBuffer();
        System.out.println("enter your addhar id");
        s.append(obj.nextInt());
        //taking user name
        StringBuffer s1=new StringBuffer();
        System.out.println("enter your name");
        s1.append(obj.nextLine());
        //taking user dob
        StringBuffer s2=new StringBuffer();
        System.out.println("enter your dob dd/mm/yyyy");
        s2.append(obj.nextLine());
        //modifiuser nanme
        StringBuffer s3=new StringBuffer();
        System.out.println("enter your correction name");
        s3.append(obj.nextLine());
        //taking user dob modify
        StringBuffer s4=new StringBuffer();
        System.out.println("enter your dob dd/mm/yyyy");
        s4.append(obj.nextLine());

        String a=s1.toString();
        String b=s2.toString();
        System.out.println("your addhar id="+s);
        System.out.println("your modify name is=b"+a.replace(s1,s3.toString()));
        System.out.println("your modyfy DOB= "+b.replace(s2,s4.toString()));









    }
}
