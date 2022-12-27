
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2
{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Orange","banana","pineapple");
        List<Integer> intList = fruits.stream()                                          // using map
                .map(String :: length)
                .collect(Collectors.toList());

        System.out.println(intList);
    }
}