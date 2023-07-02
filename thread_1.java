package com.company;
class Mythread1 extends Thread{
    @Override
    public void run()
    {
        while(true) {
            System.out.println("cooking>>>>>>>....................");
            System.out.println("continue.....................");

        }
    }

}
class Mythread2 extends Thread{
    @Override
    public void run()
    {
        while(true) {
            System.out.println("chatting with girls>>>>>>>....................");
            System.out.println("stop....................");

        }
    }

}
public class thread_1 {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();

    }
}
