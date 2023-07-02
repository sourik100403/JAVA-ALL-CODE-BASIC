package com.company;
class ride
{
    int i,j;
    ride(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i="+i+"j="+j);
    }
}
class B extends ride
{
    int k;
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(String msg)
    {
        super.show();
        System.out.println(msg+k);
    }

}

public class metodoverriding {
    public static void main(String[] args) {
        B ob=new B(1,2,3);
        ob.show("the value");
    }
}
