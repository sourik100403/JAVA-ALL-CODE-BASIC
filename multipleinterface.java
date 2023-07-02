package com.company;
interface D
{
    void show();
}
interface E
{
    void hide();
}
class multipleinterface  implements D,E
{
    public void show()
    {
        System.out.println("this show");
    }
    public void hide()
    {
        System.out.println("this is hide");
    }

    public static void main(String[] args) {
        multipleinterface ob=new multipleinterface();
        ob.show();
        ob.hide();
    }
}

