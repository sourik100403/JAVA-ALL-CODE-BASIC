package com.company;
class claculator
{
   static int cub(int x)
    {
        return x*x*x;
    }
}

public class staticmethod {
    public static void main(String[] args) {
        int r=claculator.cub(5);
        System.out.println(r);
    }
}
