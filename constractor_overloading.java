package com.company;
class Rectangle
{
    double width;
    double height;
    Rectangle()
    {
        width=25;
        height=25;
    }
    Rectangle(double w,double h)
    {
        width=w;
        height=h;
    }
    Rectangle(double var)
    {
        width=height=var;
    }
    double area()
    {
        return width*height;
    }
}

public class constractor_overloading {
    public static void main(String[] args) {
        double a,b,c,d;
        Rectangle obj=new Rectangle();
        Rectangle obj1=new Rectangle(10.00,20.00);
        Rectangle obj2=new Rectangle(10.00);
        System.out.println(obj.area());
        System.out.println(obj1.area());
        System.out.println(obj2.area());
    }
}
