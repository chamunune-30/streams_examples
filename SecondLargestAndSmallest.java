import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestAndSmallest {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(12, 1, 23, 34, 45, 66, 78,99);

        Integer second_smallest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("second_smallest Number: " + second_smallest);

        Integer second_Largest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("second_smallest Number: " + second_Largest);
    }
}
