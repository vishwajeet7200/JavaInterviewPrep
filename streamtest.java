import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamtest{
    
    public static void main(String[] args) {

        //count freq
        // List<Integer> numbers = Arrays.asList(1, 2, 2,9,8,9,2,1);
        // Map<Integer,Integer> ans = numbers.stream()
        // .collect(Collectors.toMap(num->num, num -> 1, Integer::sum));
        // System.out.println(ans);

        //merge two list and distinct 
        // List<Integer> numbers = Arrays.asList(1, 2, 2,9,8,9,2,1);
        // List<Integer> numbers1 = Arrays.asList(1, 2, 2,9,8,3,6,1);
        // List<Integer> ans=Stream.concat(numbers.stream(), numbers1.stream()).distinct().collect(Collectors.toList());
        // System.out.println(ans);

        //partition into two in even and odd
        //fisrt approach
        // List<Integer> numbers = Arrays.asList(1, 2, 2,9,8,9,2,1);
        // List<Integer> ans=numbers.stream().filter(num -> (num%2)==0)
        //                     .collect(Collectors.toList());
        // ans.addAll(numbers.stream().filter(num -> (num%2)==1)
        // .collect(Collectors.toList()));
        // System.out.println(Arrays.toString(ans.toArray()));
        //ideal aproach
        // List<Integer> numbers = Arrays.asList(1, 2, 2,9,8,9,2,1);
        // Map<Boolean, List<Integer>> partitioned = numbers.stream()
        //     .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        //  List<Integer> combinedList = Stream.concat(
        //     partitioned.get(false).stream(), // Odd numbers
        //     partitioned.get(true).stream()  // Even numbers
        // ).collect(Collectors.toList());

        // System.out.println("Combined List (Odd then Even): " + combinedList);
    }
}