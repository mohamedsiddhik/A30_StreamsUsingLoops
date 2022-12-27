


package streams;

import java.util.stream.Stream;

public class StreamExample
{
    public static void main(String[] args) {
//        Stream<Integer> s1 = Stream.of(0,1,2,3,4,5);
//        s1.forEach(p -> System.out.println(p));

        //array convert to streams
        Integer arr[] = new Integer[] {1,2,3,4,5,6};
        Stream<Integer> s2 = Stream.of(arr);
        s2.forEach(p -> System.out.println(p));
    }
}