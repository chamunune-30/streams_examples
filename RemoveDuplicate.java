import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args){

        List<Integer> numList = Arrays.asList(12, 23, 12 ,33, 33, 44, 44, 56, 65, 77, 77);

        List<Integer> nonDuplicates = numList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("list of numbers without duplicates:" + nonDuplicates);
    }
}
