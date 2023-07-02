package com.company;
interface area{
    final static float pi=3.14f;
    float compute(float x,float y);
}
class Rectangale implements area{
    public float compute(float x,float y)
    {
        return (x*y);
    }
}
class Circle implements  area{
    public float compute(float x,float y)
    {
        return(pi*x*y);
    }
}
public class implementsmethod {
    public static void main(String[] args) {
        Rectangale rec=new Rectangale();
        Circle cir=new Circle();
        area a;
        a=rec;
        System.out.println("area of rectangle="+a.compute(5,10));
        a=cir;
        System.out.println("area of circle="+a.compute(5,10));
    }
}
