package com.company;

public class stringbuffer_delete {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("NSECD");
        StringBuffer obj1=new StringBuffer("sourik parui is a good boy");
//        obj.append("NSECD");
//        System.out.println(obj.delete(1,3));
//        System.out.println(obj);
        System.out.println(obj.length());
        obj.deleteCharAt(2);
        System.out.println(obj);
        System.out.println(obj.substring(1));
        System.out.println(obj.substring(1,2));
        obj.append(123);
        System.out.println(obj.toString());
//        System.out.println(obj1.reverse());
        System.out.println(obj1.replace(0,6,"suraj "));

    }
}
