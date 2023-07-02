package com.company;
class thisstudent
{
    int id;
    String name;
    thisstudent()
    {
        System.out.println("default constructor");
    }
    thisstudent(int id,String name)
    {
        this();//default constructor called here
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(this.id+" "+this.name);
    }
}

public class lec_7without_this {
    public static void main(String[] args) {
        thisstudent a=new thisstudent(110,"sayan");
        thisstudent b=new thisstudent(111,"bilas");
        a.display();
        b.display();
    }
}
