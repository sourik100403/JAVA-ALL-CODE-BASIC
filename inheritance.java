package com.company;
class room
{
    int length,width;
    room(int l,int w)
    {
        length=l;
        width=w;
    }
    int area()
    {
        return (length*width);
    }
}
class house extends room
{
    int height;
    house(int l,int w,int h)
    {
        super(l,w);
        height=h;
    }
    int vol()
    {
        return (length*width*height);
    }
}

public class inheritance {
    public static void main(String[] args) {
        room obj=new room(10,20);
        house obj1=new house(10,20,30);
        System.out.println("the area of room="+obj.area());
        System.out.println("the area of house="+obj1.area());
        System.out.println("the volume of house="+obj1.vol());
    }
}
