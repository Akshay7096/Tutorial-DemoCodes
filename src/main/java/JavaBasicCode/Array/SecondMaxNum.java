package JavaBasicCode.Array;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class SecondMaxNum {

    //Question Find second highest number from array

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int secondHighest1 = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secondHighest1);


        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        System.out.println(secondHighest);

//        List<Integer> numarray = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        System.out.println(numarray.stream().sorted().skip(arr.length - 2));

       // numarray.strea()
    }

}
