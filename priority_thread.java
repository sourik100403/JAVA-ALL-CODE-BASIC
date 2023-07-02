package com.company;
class Mythr extends Thread{
    public Mythr(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        while(true) {
            System.out.println("thank you +"+this.getName());
        }
        }
}


public class priority_thread {
    public static void main(String[] args) {
        Mythr t1=new Mythr("sourik1");
        Mythr t2=new Mythr("sourik2");
        Mythr t3=new Mythr("sourik3+ MOST PRIRITY");
        Mythr t4=new Mythr("sourik4");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
