package com.tutorial.Multithreding;
class Test {
    public static void main(String[] args) {

        String resource1 = "A";
        String resource2 = "B";

        Thread t1 = new Thread(() -> {
            synchronized(resource1) {
                System.out.println("Thread1 locked Resource1");

                synchronized(resource2) {
                    System.out.println("Thread1 locked Resource2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(resource2) {
                System.out.println("Thread2 locked Resource2");

                synchronized(resource1) {
                    System.out.println("Thread2 locked Resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
