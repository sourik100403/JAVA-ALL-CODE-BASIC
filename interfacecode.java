package com.company;
interface sourik
{
    void show();
}
class Diya implements sourik
{
    public void show()
    {
        System.out.println("this is diya class");
    }
}
public class interfacecode {
    public static void main(String[] args) {
        Diya obkj=new Diya();
        obkj.show();
    }
}
