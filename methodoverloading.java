package com.company;
class overload
{
    void show()
    {
        System.out.println("empty");
    }
    void show(int a)
    {
        System.out.println(a);
    }
    int show(int a,int b)
    {
        return a*b;
    }
    double show(double a)
    {
       return (a*a);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        overload obj=new overload();
        obj.show();
        obj.show(5);
        System.out.println(obj.show(5,6));
        System.out.println(obj.show(7.7));
    }
}
