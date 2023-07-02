package com.company;
class Box
{
    int len;int width;
    Box(int len,int width)
    {
        this.len=len;
        this.width=width;
    }
    void area()
    {
        int a=this.len*this.width;
        System.out.println(a);
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Box ob=new Box(10,15);
        ob.area();
    }
}
