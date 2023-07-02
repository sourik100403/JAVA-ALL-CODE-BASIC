package com.company;
class nestedstatic {
    static int data = 30;
    static class inner {
        static void msg() {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
//        nestedstatic.inner ob = new nestedstatic.inner();
      nestedstatic.inner.msg();
    }
}


