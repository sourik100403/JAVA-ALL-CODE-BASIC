package com.company;
class A
{
    static
    {
        System.out.println("first");
        System.exit(0);
    }
    public static void main(String[] args) {
        System.out.println("last");
    }
}
