package com.company;
class thisstudent11
{
    int id;
    String name;
    String city;
    thisstudent11()
    {
        System.out.println("default constructor");
    }
    thisstudent11(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    thisstudent11(int id,String name,String city)
    {
       this(id,name);
       this.city=city;
    }
    void display()
    {
        System.out.println(this.id+" "+this.name+" "+this.city);
    }
}

public class constructor_this {
    public static void main(String[] args) {
        thisstudent11 a=new thisstudent11(110,"sayan");
        thisstudent11 b=new thisstudent11(111,"bilas","kolkata");
        a.display();
        b.display();
    }
}
