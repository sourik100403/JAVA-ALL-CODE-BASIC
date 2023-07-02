package com.company;
class name
{
    static int data=80;
    static class inner
    {
        static void show()
        {
            System.out.println("data="+data);
        }
    }
}
public class finalvariable {
    public static void main(String[] args) {
//        name.inner obj=new name.inner();
//        obj.show();
        name.inner.show();

    }

}
