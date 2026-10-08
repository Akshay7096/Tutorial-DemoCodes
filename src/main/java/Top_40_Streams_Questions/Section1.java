package Top_40_Streams_Questions;

import org.apache.poi.hpsf.Array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section1 {

    //Level - Super Easy

    public static void main(String[] args) {

    int [] a = {1,2,3,4};
    Arrays.stream(a);
    
    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    integerStream.forEach(System.out::print);
    
    List<Integer> listNum = Arrays.asList(1,2,3,4);
    Stream<Integer> stream = listNum.stream();

        Integer maxofNum = listNum.stream().max(Comparator.reverseOrder()).orElse(null);
        System.out.println(maxofNum);


        Optional<Integer> reduce = listNum.stream().reduce((x, y) -> Integer.max(x, y));
        System.out.println(reduce);


        List<Integer> listNum1 = Arrays.asList(1,2,3,4,5,5,6,7,8,2,3,1);

        System.out.println(listNum1.stream().distinct().collect(Collectors.toList()));
        listNum1.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue);


        List<String> listS = Arrays.asList("Akshay", "List", "Java", "Akash");
        List<String> a1 = listS.stream().filter(z -> z.startsWith("A")).toList();

        System.out.println(a1);


    }
}
