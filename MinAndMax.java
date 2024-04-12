import java.util.*;

public class MinAndMax {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(22, 23, 12, 25, 35, 67, 46, 88);

        Integer maxNum = numbers.stream()
                        .max(Integer::compare)
                                .orElse(null);

        System.out.println("Max number :" +maxNum );


        Integer minNum = numbers.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println("Max number :" +minNum );

    }
}
