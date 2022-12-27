
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample5
{
    static Predicate<String> p1 = s -> s.length() > 4;
    static Predicate<String> p2 = s -> s.length() > 7;
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple","orange","banana","pineapple","grapes");
        fruits.stream().limit(3).forEach(System.out::println);                       // limit.

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
        int sum = intList.stream().limit(3).reduce(0,(x,y) -> x+y);                            //reduce and limit
        System.out.println("Sum : " + sum);

        int skip = intList.stream().skip(4).reduce(0,(x,y) -> x+y);
        System.out.println("Skip : " + skip);

        System.out.println("All Match : " + fruits.stream().allMatch(p2));                  // allMatch
        System.out.println("Any Match : " + fruits.stream().anyMatch(p1));                  // anyMatch 
    }
}