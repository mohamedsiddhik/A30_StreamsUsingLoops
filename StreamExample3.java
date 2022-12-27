

//flattenMap

package  streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3
{
    public static void main(String[] args) {

        List<Integer> oddNumber = Arrays.asList(1,3,5,7,9);
        List<Integer> evenNumber = Arrays.asList(2,4,6,8);
        List<List<Integer>> listofList = Arrays.asList(oddNumber,evenNumber);
        System.out.println("Befor flattern : " + listofList);

        List<Integer> flattenList = listofList.stream()
                .flatMap(List :: stream)
                .collect(Collectors.toList());
        System.out.println("Flattern List :  " + flattenList);

    }
}