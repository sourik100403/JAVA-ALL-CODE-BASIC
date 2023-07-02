package com.company;
interface Demo
{
    void show();
}
class First
{
    void display()
    {
        System.out.println("this is first in first class");
    }
}
class Second extends First implements Demo
{
    public void show()
    {
        System.out.println("show of second class");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        First obj=new First();
        Second obj1=new Second();
        obj.display();
        obj1.show();
        obj1.display();
        Demo a;
        a=obj1;
        a.show();
    }
}
