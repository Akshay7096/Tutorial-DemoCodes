package com.tutorial.tutorial.Multithreading;

public class Main extends Thread {

    public static  void main (String[] args) {

        Thread t1 = new Thread();
      t1.start();
        SharedResource sh = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            //Exception handle here
            }
            sh.addItem();
        });

        Thread consumeItem = new Thread(() -> {
            sh.consumeItem();
        });
        producerThread.start();
        consumeItem.start();
    }
}
