package com.tutorial.tutorial.Multithreading;

public class SharedResource {

    boolean isFlag = false;

    public synchronized void addItem () {
        isFlag = true;
        System.out.println("Notify method calling");
        notifyAll();
    }

    public synchronized void consumeItem () {
        System.out.println("Inside the consumeItem()");
        if (!isFlag) {
            try {
                System.out.println("consumeItem() is waiting..");
                wait();
                System.out.println("Still waiting..");
            }catch (Exception e) {
            //exepction need to handle here
            }
        }
        isFlag = false;
    }
}
