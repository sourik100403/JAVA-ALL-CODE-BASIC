package com.company;
abstract class Base
{
    abstract void show();
}
class Last extends Base
{
    void show()
    {
        System.out.println("first show class");
    }
}
class AfterLast extends Base
{
    void show()
    {
        System.out.println("second of show class");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Last obj=new Last();
        AfterLast obj1=new AfterLast();
        Base a;
        a=obj;
        a.show();
        a=obj1;
        a.show();

    }
}
