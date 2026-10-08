package Java17Features.SealedClass;

import com.tutorial.tutorial.EngineeringDigest.Lecture1.Hashmap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

sealed class Banking permits SavingAccount, SalaryAccount, LoanAccount{
    String str = "Banking";
    void payment() {
        System.out.println("This is Banking class");
    }
}


final class SavingAccount extends Banking {
    @Override
    void payment() {
        System.out.println("This is SavingAccount class");
    }

}

non-sealed class SalaryAccount extends Banking {

    @Override
    void payment() {
        System.out.println("This is SalaryAccount class");
    }
}

 non-sealed class LoanAccount extends Banking{

     String str1 = super.str;
     void payment() {
        System.out.println("This is LoanAccount class");
    }

     void m1 () {
         System.out.println("M1");
     }

}

class simple extends LoanAccount {
  String st2 = super.str;

    @Override
    void payment() {
        System.out.println("This is LoanAccount class");
    }
    int m1 (int n) {
        return n == 0 ? 0 : 1 + (n - 1) % 9; }




}

public class Main {

    public static void main(String[] args) {

//        Banking b = new SavingAccount();
//
//        Banking c = new SalaryAccount();

        Banking d = new LoanAccount();
        d.payment();

        simple s = new simple();
        System.out.println(s.m1(9875));
//
       String str = "Hello";
        String str1 = new String("Hello") ;

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());


        List<String> list = Arrays.asList("Akshay", "Hello", "Akshay");

        List<String> dups = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(dups);


        String str11 = "Hello";
        Optional<String> values11 = Optional.ofNullable(str11);

        if (values11.isPresent()) {
            System.out.println(str11);
        } else {
            System.out.println("Null");
        }


        String string112 = "Akshay is good Programmer";

        System.out.println(Arrays.stream(string112.split(" ")).reduce((a, b) -> b + " "+ a).orElse(""));
        List<Integer> numList1 = Arrays.asList(1,2,3,4,5,6,7,1,2,6,7,8,3);

//        HashSet<Integer> hashet = new HashSet<>();
//
//        for (Integer i : numList1) {
//            hashet.add(i);
//        }
//
//        System.out.println(hashet);

        List<Integer> numList = numList1.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numList);

        List<Integer> result = numList.stream().distinct().sorted(Comparator.reverseOrder()).toList();


   /*     Map<Integer, String> map = new HashMap<>();
        map.put(1,"Akshay");
        map.put(2,"Kiran");
        map.put(3,"Suraj");

        Map<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (a, b) -> a, LinkedHashMap::new));
        */





       // LoanAccount s = new simple();

        s.payment();
        s.m1();


    }
}