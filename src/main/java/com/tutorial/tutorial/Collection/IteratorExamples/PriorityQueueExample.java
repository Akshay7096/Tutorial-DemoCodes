package com.tutorial.tutorial.Collection.IteratorExamples;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String [] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        System.out.println("priorityQueue"+priorityQueue); //[1,2,8,5] Its the Natural Order It Queue have behavior as we can say

        priorityQueue.forEach((Integer  i ) -> System.out.println(i));

        while (!priorityQueue.isEmpty()) {
            int val = priorityQueue.poll();
            System.out.println("remove from the top: " + val); // [1,2,5,8] when queue poll() then need to follow order...
        }

        //(Sorting)Comparator Max heap  opposite of min heap
        Queue<Integer> priorityQueue1Max = new PriorityQueue<>((Integer a, Integer b) -> b-a);

        priorityQueue1Max.add(5);
        priorityQueue1Max.add(1);
        priorityQueue1Max.add(8);
        priorityQueue1Max.add(2);
        System.out.println("priorityQueue1Max"+priorityQueue1Max); //[8,2,5,1] Its the Natural Order It Queue have behavior as we can say

        priorityQueue1Max.forEach((Integer  i ) -> System.out.println(i));

        while (!priorityQueue1Max.isEmpty()) {
            int val = priorityQueue1Max.poll();
            System.out.println("remove from the top: " + val); // [8,5,2,1] when queue poll() then maintain to follow order...
        }

    }
}
