package JavaBasicCode.Array;

public class MaxArrayEle {

    public static void main(String[] args) {

        int [] numArray = {1,4,12,3,14};

        int max = numArray[0];
        for (int i=1; i<numArray.length; i++) {
         if (max < numArray[i]) {
             max = numArray[i];
         }
        }
        System.out.println("Max Value from Array is :" + max);
    }
}
