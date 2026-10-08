package com.tutorial.coderArmy.Casting;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class StackQueueLecture {

    public static void main(String[] args) {

        //Queue   Dequeue (Interface to implement ArrayDeque and Linkedlist Dequeue)

        Queue<Integer> dequeue = new ArrayDeque<>();

        //enqueue
        dequeue.add(10); //To add element inside the dequeue 10, 20 But bad thing is Exception occured somecase like suppose dequeue is full that time..
        dequeue.offer(20);  // similar like add() to insert the element but it will handle the exception
        dequeue.offer(30);

        //front access

        System.out.println(dequeue.peek()); //we can use for inspect to get 1st position of element //10 It throws will not exception means  safe and alos ti return null values
        System.out.println(dequeue.element());// same // 10 It throws exception means not safe
        System.out.println(dequeue); // [10, 20, 30]

        //element to remove

        dequeue.remove();// again remove() is not safe because it thorws exception
        dequeue.poll(); // and also its safe because it is return null

        //In dequeue side added advance method which is

        //unSafe()
        //addfirst(), addLast();
        //instread of element -> getFirst(), getLast();

        //Safe()
        //offerFirst(), offerLast();
        //peekFirst(),   peekLast();
        //poolFirst(),   poolLast();

        //Priority Queue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(40);
        priorityQueue.offer(50);

        System.out.println(priorityQueue.poll());//min to max followed












    }
}
