import java.util.Arrays;
import java.util.List;

public class AverageNum {
public static void main(String[] args){
    List<Integer> numList = Arrays.asList();
    System.out.println("List of numbers" + numList);

    double average = numList.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .orElse(0.0);
    System.out.println("Average for given list of numners:" +average );


}
}
