package com.company;
import java.util.*;

public class linklit_collection {
    public static void main(String[] args) {
        LinkedList<Integer> li1=new LinkedList<>();
        li1.add(100);
        li1.add(101);
        li1.add(102);
        li1.add(104);
        li1.add(106);
        li1.add(102);
        li1.add(3,100000);
        li1.addFirst(1);
        li1.addLast(999999);
//        li1.clear();
        System.out.println(li1);
//        System.out.println(li1.getFirst());
//        System.out.println(li1.getLast());
//        System.out.println(li1.indexOf(102));
//        System.out.println(li1.lastIndexOf(102));
//        System.out.println(li1.offer(10611));
//        System.out.println(li1.offerLast(102));
//        System.out.println(li1.offerFirst(-1000));
//        System.out.println(li1.peek());
//        System.out.println(li1.peekFirst());
//        System.out.println(li1.peekLast());
//        System.out.println(li1.poll());
//        System.out.println(li1.pollLast());
//        System.out.println(li1.pollFirst());
        li1.remove(4);
       li1.push(8);
       li1.pop();
        System.out.println(li1);


        // print by using for loop
//        for(int i=0;i<=li1.size();i++)
//        {
//            System.out.println(li1.get(i));
//        }
        //print by using for each lop
//        for(Integer num:li1){
//            System.out.println(num);
//        }
        //print by using itretor interface
//        Iterator<Integer> itr=li1.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        //print previous by using itretor
//        ListIterator<Integer> itr1=li1.listIterator();
//        while(itr.hasNext()){
//            System.out.println("list iteator "+itr.next());
//        }


    }
}
