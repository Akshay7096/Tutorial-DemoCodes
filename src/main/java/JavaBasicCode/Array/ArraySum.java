package JavaBasicCode.Array;

import java.util.Scanner;

public class ArraySum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = sc.nextInt();

        System.out.println("Enter the array element");
        int [] array = new int [size];

        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Total sum of arrays " + sum);
    }
}
