package com.company;

class runnableThread1 implements Runnable{
    public void run()
    {
        while(true)
        {
            System.out.println("runnable class 1 not treat 1");
        }
    }
}
class runnableThread2 implements Runnable{
    public void run()
    {
        while(true)
        {
            System.out.println("runnable class 2 not treat 2");
        }
    }
}

public class runnable_thread {
    public static void main(String[] args) {
        runnableThread1 r1=new runnableThread1();
        Thread t1=new Thread(r1);
        runnableThread2 r2=new runnableThread2();
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

    }
}
