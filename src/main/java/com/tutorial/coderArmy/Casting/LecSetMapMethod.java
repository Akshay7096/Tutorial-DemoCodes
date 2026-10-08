package com.tutorial.coderArmy.Casting;

import java.util.*;

public class LecSetMapMethod {

    public static void main(String[] args) {
        //Set interface Interable -> Collection -> Set (Hashset) <- LinkedHashSet

        //1. Treeset  --> Duplicate not allowed and also Navigable set -> sorted (Order) follows

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        Set<Integer> treeSet1 = new TreeSet<>(List.of(1,5,3,2,1,5));


        System.out.println(treeSet1);


        //Map is interface and it extends HashMap and Tree Map (Sorted and Naviagable follows by Tree)

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Hello");
        hashMap.put(2,"Namaste");

        System.out.println(hashMap.containsValue("Hello"));

        //Entry is part of Map to Iterate Entery Set  (Means Enter is Override our toString())
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        System.out.println(entries);

        HashMap<Integer, String> strMap = new HashMap<>(hashMap);
        System.out.println(strMap.entrySet());



        hashMap.put(1,"ABC");
        hashMap.put(4,"ABC1");
        //replace only replace not the adding if not exist but put are both working...
        hashMap.replace(3,"Ak");
        hashMap.replace(7,"Ak1");
        System.out.println("  "+ hashMap);








    }

}
