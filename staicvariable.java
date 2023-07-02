package com.company;
class count
{
    static int c=0;
    count()
    {
        c++;
        System.out.println(c);
    }
}
public class staicvariable {
    public static void main(String[] args) {
        count obj1=new count();
        count obj2=new count();
        count obj3=new count();
    }
}
