import java.util.Arrays;
import java.util.List;

public class SumOfOddAndEven {

    public static void  main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 12, 23, 34, 45, 67, 56, 68);

        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 ==0)
                .mapToInt(Integer :: intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvens);

        int sumOfOdds = numbers.stream()
                .filter(num -> num % 3 ==0)
                .mapToInt(Integer :: intValue)
                .sum();
        System.out.println("\nSum of odd numbers: " + sumOfOdds);
    }
}
