package JavaBasicCode.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofString {

    public static void main(String[] args) {

        String str = "hello this is akshay hello akshay";

        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
//        Map<String, Long> collect = Arrays.stream(str.split(" "))
//                .collect(Collectors.groupingBy(s -> s, Collectors.collectingAndThen(
//                        Collectors.counting(), so) ));
//
//
//        Collectors.collectingAndThen(
//                Collectors.mapping(Employee::getSalary, Collectors.toList()),
//                list -> {
//                    Collections.sort(list, Collections.reverseOrder());
//                    return list;
//                }
//        )

      //  System.out.println(collect);


    }
}
